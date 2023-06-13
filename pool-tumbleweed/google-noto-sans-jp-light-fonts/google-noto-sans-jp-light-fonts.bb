SUMMARY = "Noto Sans Japanese Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Light weight of \
Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-light-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "8cb707b7f8169e9e15b83fb917bdcad36c024e436ecc96e296fe6d5f063f66b7a8092508b874f9e338e15a6a5bba1964eb185a032b45d1c0926c3a5615b82917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-light-fonts \
noto-sans-jp-light-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
