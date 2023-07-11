SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python310-pythondialog-3.5.3-1.4.noarch.rpm"
RPM_HASH = "19db78e01a1812afe0f93b0a7209c76d7775073818381ae88d77216689559924a7f7b2776c59d58d1dfe8b9e19b2c060ad1d4c8db8a87ac01724e9af34512358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pythondialog \
python310-pythondialog \
python3dist-pythondialog"

RDEPENDS:${PN} += "dialog \
python-abi"

inherit rpm
