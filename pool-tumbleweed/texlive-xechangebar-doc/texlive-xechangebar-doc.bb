SUMMARY = "Documentation for texlive-xechangebar"
DESCRIPTION = "This package includes the documentation for texlive-xechangebar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-xechangebar-doc-2023.209.1.0svn54080-53.2.noarch.rpm"
RPM_HASH = "528d3258e331dc584941aa1a624a779ef49ae4fb72668193dbdcc023a95f148ba24bcc6dcd7d3942ff1a633cb3946ca5f68a045611f5fb9788893f21959b8af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xechangebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
