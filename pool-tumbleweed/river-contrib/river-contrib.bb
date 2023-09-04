SUMMARY = "Helper files for making river easy to use"
DESCRIPTION = "This package contains files that make river easier to use such as \
listing it to a Display Manager such as GDM with a desktop file or \
setting up sane environmental variables before running river in \
`river.sh`. These files are not part of the river project."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-contrib-0.2.4+g953-2.1.noarch.rpm"
RPM_HASH = "48f48129abdf4da7f0a4d633d50b1362493556d5747349ec6e8fd8cee41ac20b3d7049fb817af6b252bd169b9ad1ef500ba0db567b0e4d0b03af7a963d6f9ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-contrib"

RDEPENDS:${PN} += "/usr/bin/env \
river"

inherit rpm
