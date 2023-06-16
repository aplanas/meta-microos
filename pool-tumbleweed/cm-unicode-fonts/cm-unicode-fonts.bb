SUMMARY = "Unicode Version of the Computer Modern Fonts"
DESCRIPTION = "Computer Modern Unicode fonts were converted from metafont sources \
using [1] textrace and [2] pfaedit (030404). Their main purpose is to \
create free good quality fonts for use in X Window System applications \
supporting many languages. Currently the fonts contain glyphs from \
Latin1 (Metafont ec, tc), Cyrillic (la, rx) and Greek (cbgreek when \
available) code sets."
LICENSE = "OFL-1.1"

PV = "0.7.0"

RPM_NAME = "cm-unicode-fonts-0.7.0-195.17.noarch.rpm"
RPM_HASH = "914d90cabe3b9ddbaf16d2f07d796c8a51228b8d9214e45ec8eb301fc5c90458bda03927f9fc36f475467f2083c5e2b266ceecf6b0026b7ec4578157760b4991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cm-unicode \
cm-unicode-fonts \
locale-ru;bg;el"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
