SUMMARY = "Documentation for texlive-avremu"
DESCRIPTION = "This package includes the documentation for texlive-avremu"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn35373"

RPM_NAME = "texlive-avremu-doc-2023.209.0.0.1svn35373-54.1.noarch.rpm"
RPM_HASH = "f5715957b45d4f9ac3171abe6914a461f83535a86d257d2e398a467fd9e356409980822814a0ee26f8c98f426594617092fe4bde05675004a446adf004de9a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-avremu-doc"

RDEPENDS:${PN} += ""

inherit rpm
