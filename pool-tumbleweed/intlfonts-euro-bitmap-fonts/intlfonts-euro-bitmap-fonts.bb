SUMMARY = "European fonts for the X Window System"
DESCRIPTION = "European fonts for the X Window System (ISO 8859-1, 8859-2, 8859-3, \
8859-4, 8859-5/9, 8859-7, and 8859-8 together with \
KOI8-1/GOST19768.74-1)."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-euro-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "026be02f1b44f266bbf12dd4f5a2f4407dfd303c658ee1c00a2b1f7653d68895ee11ca418fc8e8e22ff1e711600d2cc26aacbc9941ef8e3a60160adb1e96cf4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifnteuro \
intlfonts-euro-bitmap-fonts \
locale-xorg-x11-cs;el"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
