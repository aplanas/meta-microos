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

RPM_NAME = "python310-wiring-0.4.0-2.18.noarch.rpm"
RPM_HASH = "df48c8e9ceffd9969179954e58fbb7f104f47027c743e9a25da0130e2a3628dfc4b7823e5f7252501f638173229b74e098db87992be51aaaea32bc863ca608aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wiring \
python310-wiring \
python3dist-wiring"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
