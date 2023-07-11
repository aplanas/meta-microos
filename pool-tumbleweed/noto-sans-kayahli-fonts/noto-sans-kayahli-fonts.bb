SUMMARY = "Noto Kayah Li Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
KayahLi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kayahli-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "555b4a801c76d20fbbd286ed41cd0ee8b4d1eed606dc17adb920e5886c575e43ed2aa86fd36879b22062a59712a593c95a43672c750d832ca8d60e67592cce6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kayahli \
noto-sans-kayahli-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
