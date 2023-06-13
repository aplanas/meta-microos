SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python39-pythondialog-3.5.3-1.3.noarch.rpm"
RPM_HASH = "51b59293e8f920cde49d3c2b13fe056a14779a66bf5d37c00009274c1964dc115d95ba9b431da09048c77aed63f7547d47d4dc50df58a2118daf518e397e322c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pythondialog) \
python39-pythondialog \
python3dist(pythondialog)"

RDEPENDS:${PN} += "dialog \
python(abi)"

inherit rpm
