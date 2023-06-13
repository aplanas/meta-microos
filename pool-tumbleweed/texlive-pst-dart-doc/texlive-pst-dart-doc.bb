SUMMARY = "Documentation for texlive-pst-dart"
DESCRIPTION = "This package includes the documentation for texlive-pst-dart"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn60476"

RPM_NAME = "texlive-pst-dart-doc-2023.201.0.0.03svn60476-52.1.noarch.rpm"
RPM_HASH = "d0c7816801c9fca2981dda9e83b9c4624766688e76d258659ac0f90ff564453f57311762e92a0d36d59a40f7ef50588273d358ae0f17847355b17a465a471922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-dart-doc"

RDEPENDS:${PN} += ""

inherit rpm
