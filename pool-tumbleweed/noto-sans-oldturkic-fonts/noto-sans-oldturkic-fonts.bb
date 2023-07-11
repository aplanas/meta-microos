SUMMARY = "Noto Old Turkic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldTurkic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldturkic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "311e52af73ee044fdfe54d4e276c4e6c074b7be7151609b69223e20591a2fb98af07023b129b6e192798411ebd825c7d3e413a8a51deaa758a59fbab9333bbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldturkic \
noto-sans-oldturkic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
