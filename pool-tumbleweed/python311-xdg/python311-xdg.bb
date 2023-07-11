SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "5.1.1"

RPM_NAME = "python311-xdg-5.1.1-1.6.noarch.rpm"
RPM_HASH = "d032c65883423b2aebd5acfc9bd47b1e3a6e092b53df36bb0e66388cd15af007042b94ee085f7b3ba25d6fe0ab0673a7be85cf5aad2214d8f2a20c364ebfa6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xdg \
python3.11dist-xdg \
python311-xdg \
python3dist-xdg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
