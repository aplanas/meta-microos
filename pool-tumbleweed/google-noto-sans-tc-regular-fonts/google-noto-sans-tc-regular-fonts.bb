SUMMARY = "Noto Sans Traditional Chinese Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular weight \
of Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-regular-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "ca862c423f0903851bdd009eccb430fffaa011ed5f7da67df7b95b18e39b0cd23968821a65e2fab38703429cb53ceaf709a3b3cb9c8e23a7f45c9526f7bf61ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-regular-fonts \
noto-sans-tc-regular-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
