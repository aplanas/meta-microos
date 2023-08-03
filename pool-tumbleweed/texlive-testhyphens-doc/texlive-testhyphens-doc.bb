SUMMARY = "Documentation for texlive-testhyphens"
DESCRIPTION = "This package includes the documentation for texlive-testhyphens"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn38928"

RPM_NAME = "texlive-testhyphens-doc-2023.209.0.0.7svn38928-55.1.noarch.rpm"
RPM_HASH = "38c7deeb3d76f3a45c3efb87e06bd7ccba0e963dcbf9b9db62606a066c89c9aabbd1100f0953d4fb0a154a868f200bf4c4303d0d1e3425009ccf994eebe6aa24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-testhyphens-doc"

RDEPENDS:${PN} += ""

inherit rpm
