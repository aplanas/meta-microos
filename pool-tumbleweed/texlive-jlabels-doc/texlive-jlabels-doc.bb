SUMMARY = "Documentation for texlive-jlabels"
DESCRIPTION = "This package includes the documentation for texlive-jlabels"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24858"

RPM_NAME = "texlive-jlabels-doc-2023.209.svn24858-56.1.noarch.rpm"
RPM_HASH = "564f7ede2405c058c36fff17fa21896a74183355e80972c59b48af823376fd10f309609020cc733721b93608130a4109233d2e818c91686aa2362e45bca335ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jlabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
