SUMMARY = "Documentation for texlive-adjmulticol"
DESCRIPTION = "This package includes the documentation for texlive-adjmulticol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn63320"

RPM_NAME = "texlive-adjmulticol-doc-2023.209.1.5svn63320-55.1.noarch.rpm"
RPM_HASH = "5cd60d4e7fad00a0ae7519dc62e077f1380bbda89a29c65e4dd9a665a9c347afe0a0a4ed3f80455f1fdea09adf85d274ed1e0ad3d94e15581e70d6f8c6ead06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adjmulticol-doc"

RDEPENDS:${PN} += ""

inherit rpm
