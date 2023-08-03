SUMMARY = "Documentation for texlive-ofs"
DESCRIPTION = "This package includes the documentation for texlive-ofs"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn16991"

RPM_NAME = "texlive-ofs-doc-2023.209.svn16991-55.1.noarch.rpm"
RPM_HASH = "327a28c08861150e23f81ff4fe808b74e05bee8f0a65886dcff907a47b8203538e8ef539ba39ef33dfeec960300d888c4076f539f6b976d00a0a4adf10aa6105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ofs-doc-en;cs \
texlive-ofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
