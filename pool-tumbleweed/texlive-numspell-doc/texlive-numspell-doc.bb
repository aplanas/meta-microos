SUMMARY = "Documentation for texlive-numspell"
DESCRIPTION = "This package includes the documentation for texlive-numspell"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn61132"

RPM_NAME = "texlive-numspell-doc-2023.201.1.5svn61132-54.1.noarch.rpm"
RPM_HASH = "b9781e19afcccda6e882fc10d08c4fb3368bbe07836140b11cc8fb9911aa6a1aa4939a05fe4199fef335a1c7dac7576bc0be9fa99c4439527977488afcede1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numspell-doc"

RDEPENDS:${PN} += ""

inherit rpm
