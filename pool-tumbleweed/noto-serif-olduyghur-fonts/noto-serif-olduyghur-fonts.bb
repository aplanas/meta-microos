SUMMARY = "Noto Old Uyghur Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldUyghur Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-olduyghur-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "c88d08adad9f0072e524731c4d801ca8b426ef02ef2f6c13ada660b593831d18cd0a07252bfb83851dfd6632f34bebb7dd7158df981fdf6cba43ee76a1f69913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-olduyghur \
noto-serif-olduyghur-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
