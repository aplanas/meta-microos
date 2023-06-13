SUMMARY = "Documentation for texlive-abbr"
DESCRIPTION = "This package includes the documentation for texlive-abbr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-abbr-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "c5c6fd1c8c0b5117cc6267b18236fcf8835f34a142f2545b9d48806839d79661c92052170807c85e91425f4e9f9739c1e94797852e8d372876aacf66661e18f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
