SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "5.1.1"

RPM_NAME = "python39-xdg-5.1.1-1.6.noarch.rpm"
RPM_HASH = "bda1bae88a20610642a81c64ed9216cef12593873e847c15852a94e2d3dd3212fa2cc5f8007617ed6fc56e34069344f1f527fcde019b418a048e4dbf38b00d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xdg \
python39-xdg \
python3dist-xdg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
