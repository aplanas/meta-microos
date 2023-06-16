SUMMARY = "VL-Gothic TrueType font family"
DESCRIPTION = "This package provides 'VLGothic' Japanese TrueType fonts which are \
based on the M+ fonts and the Sazanami fonts."
LICENSE = "BSD-3-Clause & mplus"

PV = "20220612"

RPM_NAME = "vlgothic-fonts-20220612-2.1.noarch.rpm"
RPM_HASH = "5b22766fb4cab033075290723fb4db39ee12e3e7b42020eec80289f5d54b8e4645f34d4667316a33fbeb46e8791b8c1f91201c8f815d4fdf1c2504e01e5b6b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ja \
scalable-font-ja \
vlgothic \
vlgothic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
