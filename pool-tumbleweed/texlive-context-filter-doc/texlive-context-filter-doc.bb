SUMMARY = "Documentation for texlive-context-filter"
DESCRIPTION = "This package includes the documentation for texlive-context-filter"
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn62070"

RPM_NAME = "texlive-context-filter-doc-2023.204.svn62070-54.1.noarch.rpm"
RPM_HASH = "ee29a42bac86be8ef718c0d9806aaa6654afe68ffe84c5f5e9ce646965f1c41a10448143962125ff8bb1b21a3470d3cc1e8c5dc0320093416ab5e2f34dea8cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-filter-doc"

RDEPENDS:${PN} += ""

inherit rpm
