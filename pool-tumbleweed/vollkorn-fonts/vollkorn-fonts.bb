SUMMARY = "A serif font for everyday use"
DESCRIPTION = "Vollkorn is a text face with dark and meaty serifs and a bouncing look. \
It might be used as body type as well as for headlines or titles. \
 \
('Vollkorn' is German for »wholemeal« which refers to the old term \
'Brotschrift'.)"
LICENSE = "OFL-1.1"

PV = "4.105"

RPM_NAME = "vollkorn-fonts-4.105-2.11.noarch.rpm"
RPM_HASH = "4c04d8e3fd86cfa106785378447ed7bfcd811426651a36deeb2de01d441536fcddc7c49b4ce1e54cb6b19989200367dd11a9c540d9465d5b36947730e4025d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vollkorn-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
