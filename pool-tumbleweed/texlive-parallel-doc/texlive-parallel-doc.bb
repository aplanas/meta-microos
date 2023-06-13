SUMMARY = "Documentation for texlive-parallel"
DESCRIPTION = "This package includes the documentation for texlive-parallel"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-parallel-doc-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "b2bfbe155c5006a92c753ab6a6e7b4cb7e54483499a03ab4ca3255b7e8cebaf13f16a3fd4caf24eea179845b95097dd75301b5232ef4239286315198d58f01cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parallel-doc"

RDEPENDS:${PN} += ""

inherit rpm
