SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python311-pythondialog-3.5.3-1.4.noarch.rpm"
RPM_HASH = "8a50cc542487c52b12f8ff6f284bbbf629bb363138518b83fe3fa317d99f6f340796a4b81d9489bb3b4f3669b10901f79727e25ede0cb46183befbc8d8249e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythondialog \
python3.11dist-pythondialog \
python311-pythondialog \
python3dist-pythondialog"

RDEPENDS:${PN} += "dialog \
python-abi"

inherit rpm
