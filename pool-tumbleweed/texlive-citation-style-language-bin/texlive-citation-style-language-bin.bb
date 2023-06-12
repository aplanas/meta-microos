SUMMARY = "Binary files of citation-style-language"
DESCRIPTION = "Binary files of citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64151"

RPM_NAME = "texlive-citation-style-language-bin-2023.20230311.svn64151-91.1.aarch64.rpm"
RPM_HASH = "83737b66af583f88550db02b903d836a7bc245d5285fd4f5c88d6a733cdd9c310567a020a54366a0a408594d1c927754363952d73cfea0ae34b13e043d73e865"

RPROVIDES:${PN} += "texlive-citation-style-language-bin \
texlive-citation-style-language-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-citation-style-language"

inherit rpm
