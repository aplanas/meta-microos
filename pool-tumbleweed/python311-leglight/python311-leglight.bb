SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-leglight-0.2.0-1.7.aarch64.rpm"
RPM_HASH = "6ada3c237c139104ab6a0b9588b01b5adc74a149b7a03b50152470c525fcbc63d75f63d5db44dcc3ecbc9ce047a33b3f7a7bdb24f877fdb27156a99849347bde"

RPROVIDES:${PN} += "python3-leglight \
python3.11dist-leglight \
python311-leglight \
python3dist-leglight"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-zeroconf"

inherit rpm
