SUMMARY = "Architectural foundation for Python applications"
DESCRIPTION = "Wiring provides architectural foundation for Python applications, featuring: \
* dependency injection \
* interface definition and validation \
* modular component configuration \
* small, extremely pedantic codebase \
 \
Full documentation is available at http://wiring.readthedocs.org"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-wiring-0.4.0-2.17.noarch.rpm"
RPM_HASH = "dc83a2a972e8dcf2e63f14a4197c93cae09ad56b2b3ef55f57f3c6a221f081e9723b6cd47abdfb1029778bcf1082f287b1f3d49658fcf45ba0fc5904904814a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wiring) \
python39-wiring \
python3dist(wiring)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
