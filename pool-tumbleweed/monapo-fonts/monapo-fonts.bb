SUMMARY = "Monapo Japanese Truetype font"
DESCRIPTION = "This package provides 'monapo' Japanese TrueType font which is \
based on IPA fonts (v3).  Monapo font is adjusted to be compatible \
with MS P Gothic so that it can show Japanese Ascii Art properly."
LICENSE = "IPA"

PV = "20170722"

RPM_NAME = "monapo-fonts-20170722-1.10.noarch.rpm"
RPM_HASH = "3ce209da7b39b95b7d19af92ca4872d58839278513e22b67a6786b669c809d580698fc7bc8bd1fe9234050750b50c1a70b9ef1adf28b22d3d5072b273bcf1942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(ja) \
monapo \
monapo-font \
monapo-fonts \
scalable-font-ja"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
