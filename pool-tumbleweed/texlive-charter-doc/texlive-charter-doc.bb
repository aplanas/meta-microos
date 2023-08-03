SUMMARY = "Documentation for texlive-charter"
DESCRIPTION = "This package includes the documentation for texlive-charter"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-charter-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "c8df2fd0898ec5bb27bb9f5330de8fd3d93ac13de4aa54ae1c5a3c141a64b0ca6fd03478189f5db4b53909b41bc2e29cc7a2c0fd3045aa931057bc5fc18107de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-charter-doc"

RDEPENDS:${PN} += ""

inherit rpm
