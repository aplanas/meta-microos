SUMMARY = "Documentation for texlive-bnumexpr"
DESCRIPTION = "This package includes the documentation for texlive-bnumexpr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn59244"

RPM_NAME = "texlive-bnumexpr-doc-2023.209.1.5svn59244-53.1.noarch.rpm"
RPM_HASH = "b83772083939649e1ac82b36c2ad7b59b80e95e5497d9a0cf71d26fb86533160055a8fb544443085224598188e7109d06a68001392c42e967216f1e6fa1f8498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bnumexpr-doc"

RDEPENDS:${PN} += ""

inherit rpm
