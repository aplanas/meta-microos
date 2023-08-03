SUMMARY = "Documentation for texlive-cooking"
DESCRIPTION = "This package includes the documentation for texlive-cooking"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9bsvn15878"

RPM_NAME = "texlive-cooking-doc-2023.209.0.0.9bsvn15878-55.1.noarch.rpm"
RPM_HASH = "07b21ca97e74e3424ea11c66042898c5832b3e4727d89c49b541042d40bcba0e8e941345100fc04e064786c625d58fa83b13d567ca4f39637c718aecb58fe6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooking-doc"

RDEPENDS:${PN} += ""

inherit rpm
