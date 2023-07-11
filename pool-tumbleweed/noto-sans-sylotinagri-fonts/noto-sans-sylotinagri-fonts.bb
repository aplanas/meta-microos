SUMMARY = "Noto Syloti Nagri Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SylotiNagri Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sylotinagri-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "bc040f6bc5285df833dd0f0d6ba6d8f9c5f38ec25ff4f47addcffd2b2666e38874a30d70de620962db414bdf58d5cc2bd23953b708c750b5a6c3acdb5b4549c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sylotinagri \
noto-sans-sylotinagri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
