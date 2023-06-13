SUMMARY = "A program to generate language tag files used with various editors"
DESCRIPTION = "Universal ctags, a maintained fork from Darren Hieberts project, generates tag \
files from source code for various languages to be used with Editors like \
Emacs, Vim and several others."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "universal-ctags-6.0.0-1.2.aarch64.rpm"
RPM_HASH = "9d5979acf1c3d3bad1bb21eff03bb96c75ca37267d63b89cd03f06d22ebafbf6d069528022b09ac4f9b76a7cd3de45010eb47746f171e2ef3029b192f1f17f35"

RPROVIDES:${PN} += "universal-ctags \
universal-ctags(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
update-alternatives"

inherit rpm
