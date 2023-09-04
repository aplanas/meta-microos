SUMMARY = "Documentation for texlive-interval"
DESCRIPTION = "This package includes the documentation for texlive-interval"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn50265"

RPM_NAME = "texlive-interval-doc-2023.209.0.0.4svn50265-54.1.noarch.rpm"
RPM_HASH = "131c12b64c893f64efc39b7a394bb7586e73f62d242822b1dd06da6880ced31b41ec58105af093f7d6fc65bc28f6bf2cde6a7b2eca86859cb8623bd943e0bef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interval-doc"

RDEPENDS:${PN} += ""

inherit rpm
