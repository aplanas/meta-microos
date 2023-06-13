SUMMARY = "Noto Sans Korean Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Light weight of \
Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-light-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "e4020cdc4cddff27dc6ece3aec2409efb4e1fdff33566e08826ff2854d353be014ceab97a9bfb0b85b8305a5bd4d9b4cc4eb904ba649df2f2dc200e5d8f65b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-light-fonts \
noto-sans-kr-light-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
