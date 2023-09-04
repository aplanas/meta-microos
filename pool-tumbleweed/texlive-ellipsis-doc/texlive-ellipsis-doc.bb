SUMMARY = "Documentation for texlive-ellipsis"
DESCRIPTION = "This package includes the documentation for texlive-ellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn55418"

RPM_NAME = "texlive-ellipsis-doc-2023.209.1.8svn55418-54.2.noarch.rpm"
RPM_HASH = "fe294121b05a7daddf0764f2394deecf5d0184001211298e8e653c9e591199949df5d65d1bae4d548d1149297112c54da5ef315e4fe50ee488c9865a8dc7c190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
