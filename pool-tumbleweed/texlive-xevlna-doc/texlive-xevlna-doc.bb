SUMMARY = "Documentation for texlive-xevlna"
DESCRIPTION = "This package includes the documentation for texlive-xevlna"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn43864"

RPM_NAME = "texlive-xevlna-doc-2023.201.1.1svn43864-52.2.noarch.rpm"
RPM_HASH = "37b306e94850a6f2a915ecd605074798d26c429f36cc99ed2915898f0ee7de9ea1adb34a1eecb3cb742837759a081e58f15f6b902a8b680ed65c04fa9a33cea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xevlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
