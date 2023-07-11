SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python310-pytest-echo-1.7.1-1.13.noarch.rpm"
RPM_HASH = "85c11efec341143f2d3dee34f8af22d160204756d4b9b40ff27a27467def47d37f9af057c4f6cd402699c19593d577052e4f4ea225202cd2610f190185fb5ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-echo \
python310-pytest-echo \
python3dist-pytest-echo"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
