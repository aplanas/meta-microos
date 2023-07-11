SUMMARY = "Documentation for texlive-grant"
DESCRIPTION = "This package includes the documentation for texlive-grant"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.5svn56852"

RPM_NAME = "texlive-grant-doc-2023.201.0.0.0.5svn56852-53.2.noarch.rpm"
RPM_HASH = "2c6acf457e49adfd1b9aa29c405a505e68912bca4834154dee150c267794f1ef46e8a20f46ae16f175c1e10281ac7acd36eb58263f0458e66da8ab2d54bafd36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grant-doc"

RDEPENDS:${PN} += ""

inherit rpm
