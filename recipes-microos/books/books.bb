SUMMARY = "Several Linux Books"
DESCRIPTION = "This package contains some books, which are installed under \
/usr/share/doc/Books. \
 \
The books are: \
 \
'Linux Installation and getting started' by Matt Welsh \
 \
'Linux Programmers Guide' by Sven Goldt and Sven van der Meer \
 \
'Linux Network Administrators Guide, Second Edition' by Olaf Kirch and \
Terry Dawson \
 \
'Linux System Administrators Guide' by Lars Wirzenius \
 \
'Linux Users Guide' by Larry Greenfield \
 \
'Linux Kernel 2.4 Internals' by Tigran Aivazian \
 \
'The Linux Kernel Module Programming Guide' by Ori Pomerantz"
LICENSE = "GPL-2.0+ & SUSE-LDPL-2.0"

PV = "2009.1.12"

RPM_NAME = "books-2009.1.12-22.16.noarch.rpm"
RPM_HASH = "a6f8caf1b3b69de1c9086c4ed7e5433ab8b12d8e9ffdde05c0a05de3d194337bed5feb5b6c66424d13fe4f8e8d9eec3e375be40a49d8ea9d051f5b3473c04628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "books handbuch lx-buch1"
RDEPENDS:${PN} += ""

inherit rpm
