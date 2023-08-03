SUMMARY = "Documentation for texlive-gmverb"
DESCRIPTION = "This package includes the documentation for texlive-gmverb"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-doc-2023.209.0.0.98svn24288-54.1.noarch.rpm"
RPM_HASH = "d3a80e7294dab92591cfa29260e97b2771a84d8bcb15b9d48ffba393f8824a66faeea09404f1cd16e92835148ce3fd61cd342f256ddf753a7b284a93aed12546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
