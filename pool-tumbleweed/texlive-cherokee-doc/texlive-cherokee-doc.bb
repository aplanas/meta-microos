SUMMARY = "Documentation for texlive-cherokee"
DESCRIPTION = "This package includes the documentation for texlive-cherokee"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21046"

RPM_NAME = "texlive-cherokee-doc-2023.209.svn21046-54.1.noarch.rpm"
RPM_HASH = "1ff505c77e94d5275543f7988c4890101a6ccc70715f848e1e70524f0a457a6a58b3d154a05e84504cf638eeafef5b0f9aa9333b002e1de1d60f92fe3e3e9827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cherokee-doc"

RDEPENDS:${PN} += ""

inherit rpm
