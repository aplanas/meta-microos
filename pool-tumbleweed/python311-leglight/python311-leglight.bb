SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-leglight-0.2.0-1.6.aarch64.rpm"
RPM_HASH = "e3c95ed0add1eda8b3d6e10a2f153282738dfdec2da4af1a5712a2e15d5f94e2ce3a87217ddc2ad0be156208db1967bfdd342b5efb840cb655abb2a9afc4ebf0"

RPROVIDES:${PN} += "python3.11dist(leglight) \
python311-leglight \
python311-leglight(aarch-64) \
python3dist(leglight)"

RDEPENDS:${PN} += "python(abi) \
python311-requests \
python311-zeroconf"

inherit rpm
