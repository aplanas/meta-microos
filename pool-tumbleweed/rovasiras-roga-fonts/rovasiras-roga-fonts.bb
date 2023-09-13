SUMMARY = "A ligatureless variant of the Kende Old Hungarian font"
DESCRIPTION = "Roga is the ligatureless version of the Kende font. Both are fonts \
for the Old Hungarian script."
LICENSE = "OFL-1.1"

PV = "20230908"

RPM_NAME = "rovasiras-roga-fonts-20230908-1.1.noarch.rpm"
RPM_HASH = "bdb12955d8b29fc4d4036e9280b360e53bc207a45c846d40b5416d45bd4bcf33c17334e5e0e1f60b0fe8b71b7da60b73d44a9d1a7465b6b311905a3fec5502ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rovasiras-roga-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
