SUMMARY = "DejaVu Truetype Fonts"
DESCRIPTION = "The DejaVu fonts are a font family based on the Bitstream Vera Fonts. \
Its purpose is to provide a wider range of characters while maintaining \
the original look and feel through the process of collaborative \
development."
LICENSE = "SUSE-Permissive"

PV = "2.37"

RPM_NAME = "dejavu-fonts-2.37-1.15.noarch.rpm"
RPM_HASH = "97f5c82b471aab15541760af187c41933d36c9fe32e56fac05c43308fdaa62371ec8cae7ef3db8f7dce917246a32224a6909100b485f298597f2ec28e3227c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dejavu \
dejavu-fonts \
desktop-data-SuSE:/usr/X11R6/lib/X11/fonts/truetype/SUSESans-Roman.ttf \
locale(bg;el;mk;ru;vi)"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
