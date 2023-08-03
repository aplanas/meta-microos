SUMMARY = "Documentation for texlive-easyfloats"
DESCRIPTION = "This package includes the documentation for texlive-easyfloats"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-doc-2023.209.1.0.0svn57204-54.1.noarch.rpm"
RPM_HASH = "78341989554bbe547549e2c88e32851b4d58449bca37c740de371b5264a5f8b22f29d2094c33eccf50dc679620997241d4d9dcf6a09b33f0e76f7a6d996e371e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfloats-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
