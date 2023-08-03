SUMMARY = "Documentation for texlive-pst-dart"
DESCRIPTION = "This package includes the documentation for texlive-pst-dart"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn60476"

RPM_NAME = "texlive-pst-dart-doc-2023.209.0.0.03svn60476-53.1.noarch.rpm"
RPM_HASH = "128f8b4f57e401d17fee78c7f8d62fed672c11ab3cf9724cdbea842c6e0e19167ab2debdddccb56967425b6c69d8dfa36c9398fb66b4339398a478dc9bf422b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-dart-doc"

RDEPENDS:${PN} += ""

inherit rpm
