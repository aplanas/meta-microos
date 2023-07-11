SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python39-pythondialog-3.5.3-1.4.noarch.rpm"
RPM_HASH = "ca80893ccf17982b48dbfb08f2d187a271449e13f67ba1fdb3185b826e98fd96df6f91fc6e7049ad7b497fc5452b444ae5f37b0aac5a1a5ed12e1a651c17f51d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pythondialog \
python39-pythondialog \
python3dist-pythondialog"

RDEPENDS:${PN} += "dialog \
python-abi"

inherit rpm
