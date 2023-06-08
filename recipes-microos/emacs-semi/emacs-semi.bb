SUMMARY = "Library to provide MIME feature for GNU Emacs"
DESCRIPTION = "SEMI is a library to provide MIME feature for GNU Emacs.  MIME is a \
proposed internet standard for including content and headers other than \
(ASCII) plain text in messages"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.6+239+gb1c245b81715"

RPM_NAME = "emacs-semi-1.14.6+239+gb1c245b81715-1.4.noarch.rpm"
RPM_HASH = "62c461c8759462c5e52278d124ea058ee5559b74f53518f849d9e08ed0bb7220550f251081da4dff71e4944a3affad243d437136807e88fd0f545604b64792d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-semi semi-emacs"
RDEPENDS:${PN} += "emacs emacs-flim emacs_program"

inherit rpm
