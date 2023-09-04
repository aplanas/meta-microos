SUMMARY = "Documentation for texlive-emulateapj"
DESCRIPTION = "This package includes the documentation for texlive-emulateapj"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28469"

RPM_NAME = "texlive-emulateapj-doc-2023.209.svn28469-54.2.noarch.rpm"
RPM_HASH = "24216c941c942c6e857ea6d9d66ed5b9744b2ebc93c2109779d9f4caee25b50557c06c32182fa56946c799f87fc876b9d5155702daa9416d337f8f6f0fc2c36f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emulateapj-doc"

RDEPENDS:${PN} += ""

inherit rpm
