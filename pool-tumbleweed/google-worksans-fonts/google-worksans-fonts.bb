SUMMARY = "A Grotesque Sans Serif Font"
DESCRIPTION = "Work Sans is a typeface family with 9 weights, and based loosely on \
early Grotesques — for example, Stephenson Blake, Miller & Richard \
and Bauerschen Giesserei. \
 \
Work Sans had been updated between 2018–2020 with accompanying italics, variable \
font files and the character set had been expanded to the Google Latin Expert \
glyph set, which supports Vietnamese."
LICENSE = "OFL-1.1"

PV = "2.010"

RPM_NAME = "google-worksans-fonts-2.010-1.7.noarch.rpm"
RPM_HASH = "b395f7dd8826d1f3b5bae1ad0df998a68d71f0078bff59b40bb239b38408aa8fda07449faac0e1235c71c48e5a223d92b3d3f2e9d69e427c3df55f62a69971e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-worksans-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
