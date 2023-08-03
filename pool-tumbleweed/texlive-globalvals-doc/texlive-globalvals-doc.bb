SUMMARY = "Documentation for texlive-globalvals"
DESCRIPTION = "This package includes the documentation for texlive-globalvals"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49962"

RPM_NAME = "texlive-globalvals-doc-2023.209.1.1svn49962-54.1.noarch.rpm"
RPM_HASH = "847f554392efb9718e0f5337e79db7832772b4b8efd65d0683875cd4fcb55b74a8ae51698de0e6f2edcf1d1c4d712243efbb176397662a6b71278ced3c912384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-globalvals-doc"

RDEPENDS:${PN} += ""

inherit rpm
