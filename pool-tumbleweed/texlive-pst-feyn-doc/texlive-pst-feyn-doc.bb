SUMMARY = "Documentation for texlive-pst-feyn"
DESCRIPTION = "This package includes the documentation for texlive-pst-feyn"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn48781"

RPM_NAME = "texlive-pst-feyn-doc-2023.209.0.0.01svn48781-53.1.noarch.rpm"
RPM_HASH = "39d1f68ebf74b16d3eed72d951bdf4e26e3927e73d9a0f6d2109c4db8d38f609ff4ac405b992adf91ae41292a63ffeaf8e90b4d8bd74d76e9b4254bd8cdc5b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-feyn-doc"

RDEPENDS:${PN} += ""

inherit rpm
