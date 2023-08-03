SUMMARY = "Documentation for texlive-threadcol"
DESCRIPTION = "This package includes the documentation for texlive-threadcol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn28754"

RPM_NAME = "texlive-threadcol-doc-2023.209.1.0svn28754-55.1.noarch.rpm"
RPM_HASH = "05f3b0204f888b84528bfae4828059c3047e0924e5311e6ec0b0313e331f23f378fa0313c55e94950f647c14ea0cf9bee6e2cba0f6b991ccc043082674f2a25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threadcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
