SUMMARY = "Crimson Text Serif Font"
DESCRIPTION = "Crimson Text is a font family for book production in the tradition \
of beautiful oldstyle typefaces. \
Crimson Text was born after years of discontent with the choice of \
free text typefaces. It is a friendly, classical old-style font for books."
LICENSE = "OFL-1.1"

PV = "20111206"

RPM_NAME = "aldusleaf-crimson-text-fonts-20111206-11.17.noarch.rpm"
RPM_HASH = "13b3c920b8ed05aef637fffa68c0d9b8b06c147e5520d901b8f8a9430ab6979f46e5b0a25387c367562384c0c8252b19747a3751b4ca9e5596bf9d466d552833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aldusleaf-crimson-text-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
