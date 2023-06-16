SUMMARY = "Wire Font"
DESCRIPTION = "Wire is a condensed monoline sans. Its modular-based characters are \
flavored with a sense of art nouveau. Nearly hairline thickness suggests \
usage for body text above 12px. While at display sizes it reveals its \
tiny dot terminals to create a sharp mood in headlines. \
 \
For web typesetting it is recommended to adjust letter-spacing for sizes \
below 30px to 0.033em and up. For 12 px we recommend the value of \
0.085em."
LICENSE = "OFL-1.1"

PV = "1.000"

RPM_NAME = "cyreal-wire-fonts-1.000-7.17.noarch.rpm"
RPM_HASH = "96d3744c5546de3fd29566015dc9a2af996c1dfacd5d900eebd9eee8a06a4e7a86747772a78fdcdba35e3661ceaefda7583e9c77eaf26db9729aa1e639899dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-wire-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
