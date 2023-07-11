SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "5.1.1"

RPM_NAME = "python310-xdg-5.1.1-1.6.noarch.rpm"
RPM_HASH = "a22f564327dbafec363f4d9948eb27bdd6c887b3e383cb342e853c167029137556208b397cd69fa1e3da9af5dbe671a408ec83b105b2236d411ce0f112d98492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xdg \
python310-xdg \
python3dist-xdg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
