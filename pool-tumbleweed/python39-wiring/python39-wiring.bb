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

RPM_NAME = "python39-wiring-0.4.0-2.18.noarch.rpm"
RPM_HASH = "684d10e7decdf84f8609053e85059bc03360be45df14486723ba8abea2ee297b91d31dbf795c557309f8c0ae2dab51462de49eeee7bfee13b8a8fe2028b8aa93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wiring \
python39-wiring \
python3dist-wiring"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
