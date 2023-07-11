SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-leglight-0.2.0-1.7.aarch64.rpm"
RPM_HASH = "4b2fe8e454d0e0bc04add168e45b9acb1ff1a37e8a93eac4e9187b4c38f538cae6d23725d67eed26244e56cd0476861aab84c374f93f5fbf4994cc02a4ddd7c4"

RPROVIDES:${PN} += "python3.9dist-leglight \
python39-leglight \
python3dist-leglight"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-zeroconf"

inherit rpm
