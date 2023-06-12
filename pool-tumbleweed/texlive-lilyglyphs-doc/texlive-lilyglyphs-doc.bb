SUMMARY = "Documentation for texlive-lilyglyphs"
DESCRIPTION = "This package includes the documentation for texlive-lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-doc-2023.201.0.0.2.4svn56473-54.1.noarch.rpm"
RPM_HASH = "ab5ec3ef53c0f34015ac7547edff33b45f1235245b0336011237a71b6781bbbf1d2ba97338a3e8a3af0e803aede309b742b3db3a9320ace3625f5940919d2580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lilyglyphs-doc"
RDEPENDS:${PN} += ""

inherit rpm
