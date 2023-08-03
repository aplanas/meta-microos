SUMMARY = "Documentation for texlive-localloc"
DESCRIPTION = "This package includes the documentation for texlive-localloc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56496"

RPM_NAME = "texlive-localloc-doc-2023.209.svn56496-55.1.noarch.rpm"
RPM_HASH = "19b188d863a94cd83e7f14397df3d67d12ef6105a736b5b30079346410daa2ba9297ffe0a5cac37c39b3d3bdc90ed8062dc06675c344508a3df3b378c1c7d1af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-localloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
