SUMMARY = "A ligatureless variant of the Kende Old Hungarian font"
DESCRIPTION = "Roga is the ligatureless version of the Kende font. Both are fonts \
for the Old Hungarian script."
LICENSE = "OFL-1.1"

PV = "20230614"

RPM_NAME = "rovasiras-roga-fonts-20230614-1.1.noarch.rpm"
RPM_HASH = "34d574cc18edd8daed1e9a6abbda0d40a4568ef95ed2094a36ab017cdf8c0be32faf454935053be6621f0a952032445432077bf40b9098400103225c9c3bf9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rovasiras-roga-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
