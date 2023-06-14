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

RPM_NAME = "python311-wiring-0.4.0-2.17.noarch.rpm"
RPM_HASH = "73ea4b31be88693ef7b05bbd40eef3d37d6b12367a9162aa0988e11c3dd55ed95c5233ab9e8b38d6e8bd1f0302a7d51f8cb37968b4b8e6e8b3df14b23915f8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wiring \
python311-wiring \
python3dist-wiring"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
