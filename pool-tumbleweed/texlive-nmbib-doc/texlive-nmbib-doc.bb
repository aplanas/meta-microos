SUMMARY = "Documentation for texlive-nmbib"
DESCRIPTION = "This package includes the documentation for texlive-nmbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn37984"

RPM_NAME = "texlive-nmbib-doc-2023.201.1.04svn37984-54.1.noarch.rpm"
RPM_HASH = "f0cf641828d73df8efebc9d291a921a27a16548d05ce3cc869c3246ea4202c4e02c522259f12b8c000da03573a99392e1a4965c98a733c34f919e85095436bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nmbib-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
