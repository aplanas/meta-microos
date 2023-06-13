SUMMARY = "A typeface designed for source code"
DESCRIPTION = "A typeface designed for source code \
 \
Hack includes monospaced regular, bold, oblique, and bold oblique sets to cover \
all of your syntax highlighting needs. \
 \
Over 1500 glyphs that include lovingly tuned expanded Latin, modern Greek, and \
Cyrillic character sets. \
 \
Powerline glyphs are included in the regular set. Patching is not necessary. \
Install and go."
LICENSE = "Bitstream-Vera & MIT"

PV = "3.003"

RPM_NAME = "hack-fonts-3.003-2.2.noarch.rpm"
RPM_HASH = "14d041610bbc456c7ac4e2ce48b767620303f2d0a292a33b3f22385b85678f35b8bbd101e5ad737f66c64ac311398f0eca47e854560f38be28f1829ed37ac1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Hack \
hack-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
