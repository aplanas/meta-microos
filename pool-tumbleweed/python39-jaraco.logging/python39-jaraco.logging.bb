SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python39-jaraco.logging-3.1.2-2.2.noarch.rpm"
RPM_HASH = "8dd264997c0859caf8087f5191462ac568149ae476a3a78c41b18af72929630fda67896b5d22abb4ee58eec8c236eb9be766eb5890624cc2cd065e21e30d4e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.logging \
python39-jaraco.logging \
python3dist-jaraco.logging"

RDEPENDS:${PN} += "python-abi \
python39-tempora"

inherit rpm
