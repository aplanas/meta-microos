SUMMARY = "Convert Flat ASCII Text to man Page Format"
DESCRIPTION = "Txt2man converts flat ASCII text to man page format. It is a shell \
script using gnu awk, that should run on any Unix like system."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "txt2man-1.7.1-1.8.noarch.rpm"
RPM_HASH = "cb62ca9032f5816c416f5a16ba413de4fae1410f7719a580bdae409333c370432ebf2b91abe1c6dc1197107d5b8c60b43e5a5bfb8fa148cc1193c9e14604adfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "txt2man"

RDEPENDS:${PN} += "/bin/sh \
gawk"

inherit rpm
