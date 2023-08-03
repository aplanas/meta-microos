SUMMARY = "Documentation for texlive-cascade"
DESCRIPTION = "This package includes the documentation for texlive-cascade"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn65757"

RPM_NAME = "texlive-cascade-doc-2023.209.1.2asvn65757-53.1.noarch.rpm"
RPM_HASH = "b2c88867ca8d7d2a17aea849201be916b501bd98ad399bb72f4445e717ddfe86f06df441c40c2c5b85a490656c07361afb5a74122722dcf5886e954cacab1038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cascade-doc-fr \
texlive-cascade-doc"

RDEPENDS:${PN} += ""

inherit rpm
