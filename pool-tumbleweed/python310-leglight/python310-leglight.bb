SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-leglight-0.2.0-1.7.aarch64.rpm"
RPM_HASH = "8bf2aa631a5071e1e84e4cf93f76d7cffb91f7abb531786bdffc5d3cfeebbc17c05d3dda85f5ef8d514b48affb0020c84c1de3bf7a965148f7d24eebd96b039e"

RPROVIDES:${PN} += "python3.10dist-leglight \
python310-leglight \
python3dist-leglight"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-zeroconf"

inherit rpm
