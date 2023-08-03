SUMMARY = "Documentation for texlive-ling-macros"
DESCRIPTION = "This package includes the documentation for texlive-ling-macros"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42268"

RPM_NAME = "texlive-ling-macros-doc-2023.209.svn42268-55.1.noarch.rpm"
RPM_HASH = "7a08527bd50d9c4a152c2ecf363619ff26ded65283e3eac6e614e50b93e045f363f63592154981237a63fc96b1ee0e354ad6f381a4253e751e0f15759f284254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ling-macros-doc"

RDEPENDS:${PN} += ""

inherit rpm
