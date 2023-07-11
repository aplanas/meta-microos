SUMMARY = "Personal Organizer for GNOME"
DESCRIPTION = "Getting Things GNOME! (GTG) is a personal organizer for the GNOME desktop \
environment inspired by the Getting Things Done (GTD) methodology. GTG is \
designed with flexibility, adaptability, and ease of use in mind so it can be \
used as more than just GTD software. \
 \
GTG is intended to help you track everything you need to do and need to know, \
from small tasks to large projects."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "gtg-0.6-1.5.noarch.rpm"
RPM_HASH = "4d74c66152152c5a4ec6d8dd46ce3b2ba21615d05392441efba0df43fe8cb56e34e8c4cde1cb7a10e71496de5bd87e232d6537ec22e58d45aba462f6403b45e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtg"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject-Gdk \
python3-liblarch \
python3-liblarch-gtk \
python3-lxml \
python3-pycairo"

inherit rpm
