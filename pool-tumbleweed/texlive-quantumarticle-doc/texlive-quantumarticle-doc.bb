SUMMARY = "Documentation for texlive-quantumarticle"
DESCRIPTION = "This package includes the documentation for texlive-quantumarticle"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1svn65242"

RPM_NAME = "texlive-quantumarticle-doc-2023.209.6.1svn65242-54.1.noarch.rpm"
RPM_HASH = "93f1cd3bc8fc9e372841cfef4cdac61275ee1248a78bf8ba48d7fbabf715c5497fabe07b02cec109f1a7d5cb3cef8be05e8ba3eaf1e3a7c2f3c91c54ad8d096d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantumarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
