SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python311-pythondialog-3.5.3-1.3.noarch.rpm"
RPM_HASH = "06da398c30f3afc76fcdc7ba8ff8ccf3ba9633e8d0021a61b04e2cc0433730db9cbab923eb871906238a52b93233d768456e835fcbd29ddd8e8e9c346b3245a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pythondialog \
python311-pythondialog \
python3dist-pythondialog"

RDEPENDS:${PN} += "dialog \
python-abi"

inherit rpm
