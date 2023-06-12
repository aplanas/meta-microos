SUMMARY = "Documentation for texlive-dlfltxb"
DESCRIPTION = "This package includes the documentation for texlive-dlfltxb"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17337"

RPM_NAME = "texlive-dlfltxb-doc-2023.201.svn17337-52.1.noarch.rpm"
RPM_HASH = "6c264dc7684985e1b3ee7303a1c33bf3f7601f271df006b70e37bb75f3c8513f44200f9239cf6b81f4153b155b93bfba244ee98ec132b9a7ebffd1874df4e6c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dlfltxb-doc"
RDEPENDS:${PN} += ""

inherit rpm
