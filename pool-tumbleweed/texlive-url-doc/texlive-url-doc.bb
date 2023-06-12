SUMMARY = "Documentation for texlive-url"
DESCRIPTION = "This package includes the documentation for texlive-url"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn32528"

RPM_NAME = "texlive-url-doc-2023.201.3.4svn32528-53.1.noarch.rpm"
RPM_HASH = "3d596f580993d646aade294812fc29e402535da49afe202b572f25044ebf71d2c3da3d70a19837a424db8c4771acfbd160a6c830b25c8a736ca6e3b8e39c96ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-url-doc"
RDEPENDS:${PN} += ""

inherit rpm
