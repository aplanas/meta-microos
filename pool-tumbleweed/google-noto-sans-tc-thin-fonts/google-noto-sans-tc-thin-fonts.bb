SUMMARY = "Noto Sans Traditional Chinese Font - Thin"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Thin weight of \
Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-thin-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "267ac02ff243f77c69f2a48f65bd3ba9e5141656754206a3dcbb87dacae9c17e9a596d5819af0710bb72761f370b0679be3b15e32368e8c5c614ebc7e4fcd045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-thin-fonts \
noto-sans-tc-thin-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
