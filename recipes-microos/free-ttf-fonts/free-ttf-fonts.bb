SUMMARY = "Free TrueType Art Fonts"
DESCRIPTION = "More than 300 free fonts in True Type format. Most of them are in the \
art style and unusable as desktop fonts, but are great for any poster \
or illustration. \
 \
The fonts are copyrighted under the GPL or a Freeware license, but \
donations are requested by the artists. Look in \
/usr/share/doc/packages/free-ttf-fonts/ for further information."
LICENSE = "Artistic-1.0 & GPL-2.0+ & SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "free-ttf-fonts-1.0-366.17.noarch.rpm"
RPM_HASH = "6bf3eb63a2d6cd86666de035d504b11d51a41f3aa91c4620fe614a712bedd8e30a395ebf38744efda9d18a18bd7f63a3da0fc8b85d37096cb1ce9666a391bc6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "free-ttf-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
