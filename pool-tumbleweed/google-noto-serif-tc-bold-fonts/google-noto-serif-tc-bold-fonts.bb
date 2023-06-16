SUMMARY = "Noto Serif Traditional Chinese Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bold weight of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-bold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "afbb9de9e9893dac9f887db40992d0e6867c0d25baa105be81a7ffeedd1d6d715e63b56df75d9312f13a3f2afe2941ff5439cc32a6ccccb798f141ae36dd4cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-bold-fonts \
noto-serif-tc-bold-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
