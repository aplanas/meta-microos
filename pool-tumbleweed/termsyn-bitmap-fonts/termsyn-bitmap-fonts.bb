SUMMARY = "Clean, monospaced bitmap font based on Terminus and Tamsyn"
DESCRIPTION = "Termsyn is a clean monospaced bitmap font based on Terminus \
(http://terminus-font.sourceforge.net/) and \
Tamsyn (http://www.fial.com/~scott/tamsyn-font/). \
 \
There are four sizes now: 6x11, 7x12, 6x13 and 7x14. There are iso8859-1 and \
2 versions, version s with status 'icons', consolefonts, and I started working \
on iso10646-1 versions. All have bold too. \
 \
Each size has 12 fonts, for example: \
termsyn6x11r.pcf (6x11 medium) \
termsyn6x11b.pcf (6x11 bold) \
termsyn6x11r2.pcf (6x11 medium iso8859-2) \
termsyn6x11b2.pcf (6x11 bold iso8859-2) \
termsyn6x11r.icons.pcf (6x11 medium with status icons) \
termsyn6x11b.icons.pcf (6x11 bold with status icons) \
termsyn6x11r.psfu (6x11 medium consolefont) \
termsyn6x11b.psfu (6x11 bold consolefont) \
termsyn6x11r2.psfu (6x11 medium iso8859-2 consolefont) \
termsyn6x11b2.psfu (6x11 bold iso8859-2 consolefont) \
termsynu6x11r.pcf (6x11 medium iso10646-1) \
termsynu6x11b.pcf (6x11 bold iso10646-1) \
 \
You can use xfontsel or xlsfonts to get the full names."
LICENSE = "OFL-1.1"

PV = "1.8.7"

RPM_NAME = "termsyn-bitmap-fonts-1.8.7-1.17.noarch.rpm"
RPM_HASH = "4c91f2b07d409fac4325f029bc611809f41d8676165c90fa2390f461720b0c4fd12e7bfa6b0c89f93662b7baf1a277829b1069032321938d53a73c7abbc198c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "termsyn-bitmap-fonts \
termsyn-font"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
