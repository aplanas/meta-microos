SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python310-pythondialog-3.5.3-1.3.noarch.rpm"
RPM_HASH = "aa9be04643563b0dd2168b7272e64ec3f8d20ccd298e30c173069ea2dddfbffafd47b95e0688678248cea60e03368fc72fff68836a411709de00ed05f389ce0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythondialog \
python3.10dist-pythondialog \
python310-pythondialog \
python3dist-pythondialog"

RDEPENDS:${PN} += "dialog \
python-abi"

inherit rpm
