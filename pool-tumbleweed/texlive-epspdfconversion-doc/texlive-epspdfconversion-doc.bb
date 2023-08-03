SUMMARY = "Documentation for texlive-epspdfconversion"
DESCRIPTION = "This package includes the documentation for texlive-epspdfconversion"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-doc-2023.209.0.0.61svn18703-54.1.noarch.rpm"
RPM_HASH = "f2e3860c373d018ef054d12a6bf442800703fa244bd8e64055efc6dae29d9bf49e98113c8e9946c37fe28b67317496be6511b66969e834fbc420e125ef7ac0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdfconversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
