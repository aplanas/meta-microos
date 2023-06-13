SUMMARY = "Documentation for texlive-stepgreek"
DESCRIPTION = "This package includes the documentation for texlive-stepgreek"
LICENSE = "OFL-1.1"

PV = "2023.201.3.0b1svn57074"

RPM_NAME = "texlive-stepgreek-doc-2023.201.3.0b1svn57074-57.1.noarch.rpm"
RPM_HASH = "ae15a010afd1af565a19d29107fecbf906cc11d830f0ef652c98911d8a3000d5f66e828d181353e703ae4aca6220c587fc168a0c252203a1d1f0a7e0b12589ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stepgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
