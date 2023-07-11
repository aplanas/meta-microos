SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python310-requestbuilder-0.7.1-1.17.noarch.rpm"
RPM_HASH = "1ca9591cff911ba5dd69c6e12c7ab95984d75803e3948a1dd79e6411145f696d9b2a71f68894d5d206aa7e8cf1c9f579b2f4b061053779f5141b790c623544fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requestbuilder \
python310-requestbuilder \
python3dist-requestbuilder"

RDEPENDS:${PN} += "python-abi"

inherit rpm
