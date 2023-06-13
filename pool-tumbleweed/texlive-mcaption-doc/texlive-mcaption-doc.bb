SUMMARY = "Documentation for texlive-mcaption"
DESCRIPTION = "This package includes the documentation for texlive-mcaption"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-mcaption-doc-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "3aba5b324049adc02f0ef72e5ef80a2a0ce626538c26c8bd0adec068536f16bda956991701fc60a20ae3fcb5301c2ba74554a92e9cfdc5b16a1997c4cd61e403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcaption-doc"

RDEPENDS:${PN} += ""

inherit rpm
