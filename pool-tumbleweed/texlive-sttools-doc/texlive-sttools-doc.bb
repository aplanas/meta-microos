SUMMARY = "Documentation for texlive-sttools"
DESCRIPTION = "This package includes the documentation for texlive-sttools"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn60736"

RPM_NAME = "texlive-sttools-doc-2023.209.3.0svn60736-58.1.noarch.rpm"
RPM_HASH = "ffd73b81eea13f5468d752728fc7a5a745b7d74abb54b0d2452f833533ff972f0de361a619608a0e9130b015751ff2609c4e41f82e3dec464830dc584177f0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sttools-doc"

RDEPENDS:${PN} += ""

inherit rpm
