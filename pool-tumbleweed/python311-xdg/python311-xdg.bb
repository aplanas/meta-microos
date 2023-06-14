SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "5.1.1"

RPM_NAME = "python311-xdg-5.1.1-1.4.noarch.rpm"
RPM_HASH = "ee6496e0ef9c719802160569235c613bdcafe63284d75ebb1cd0a4f8d6e935d6ae204f1427c69d3eebef4383e209417e4fdac0d73af3ae2fc67f6153451bbea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xdg \
python311-xdg \
python3dist-xdg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
