SUMMARY = "Documentation for texlive-graphics-def"
DESCRIPTION = "This package includes the documentation for texlive-graphics-def"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64487"

RPM_NAME = "texlive-graphics-def-doc-2023.209.svn64487-54.2.noarch.rpm"
RPM_HASH = "ec911f7519ed29f4e905453868b16556343d33b5f8271d136e7fbb53b3a20af088ddb349b61c85e9f51372893834a77928dea143cfcdbce8cb33900a5eacd43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-def-doc"

RDEPENDS:${PN} += ""

inherit rpm
