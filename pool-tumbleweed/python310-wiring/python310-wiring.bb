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

RPM_NAME = "python310-wiring-0.4.0-2.17.noarch.rpm"
RPM_HASH = "8d6e4bfb2e07865acd47ca0e9a2c32f461e9c234b04e1e467df3bb6270de2083098d10b491119c614d158170a567d35a294943114927d53235e14e4d9f7c9343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wiring \
python3.10dist-wiring \
python310-wiring \
python3dist-wiring"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
