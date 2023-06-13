SUMMARY = "Documentation for texlive-pst-tvz"
DESCRIPTION = "This package includes the documentation for texlive-pst-tvz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-doc-2023.201.1.01svn23451-53.1.noarch.rpm"
RPM_HASH = "bc4bcca2e9d87f37732a586a12bc0e5bc1885ec1e6f4d2683ced6a4c10085fb133d38f3efead4d2ed1d1dd017b9a5600918f3473e74e80c26bc9e940672bbeff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tvz-doc"

RDEPENDS:${PN} += ""

inherit rpm
