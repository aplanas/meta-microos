SUMMARY = "Documentation for texlive-emarks"
DESCRIPTION = "This package includes the documentation for texlive-emarks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24504"

RPM_NAME = "texlive-emarks-doc-2023.201.1.0svn24504-53.1.noarch.rpm"
RPM_HASH = "851a04cd121eb860a3993f694fb05d8e937fae7d0a9d5bbaa193bf1065b72d4304143a099ab521eda385ea71112b04a409beb570d537b201d341f56c78b2b8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emarks-doc"

RDEPENDS:${PN} += ""

inherit rpm
