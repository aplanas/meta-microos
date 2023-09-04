SUMMARY = "Documentation for texlive-dynblocks"
DESCRIPTION = "This package includes the documentation for texlive-dynblocks"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-doc-2023.209.0.0.2bsvn35193-54.2.noarch.rpm"
RPM_HASH = "82dbe7484ddae49b50838427c59695fabb6002c2c34b558331a379808a1b4bab8eda3302139409ab1dbe697d1c084b5c9a682d82e9751fcca8613b149c56e194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
