SUMMARY = "Documentation for texlive-marginfix"
DESCRIPTION = "This package includes the documentation for texlive-marginfix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn55064"

RPM_NAME = "texlive-marginfix-doc-2023.201.1.2svn55064-52.1.noarch.rpm"
RPM_HASH = "7972f250eac6a22fe5adebaaeb1e18a7d17d30f34831413b8bbf94fd15166d8aad642c84d70f6694f69bd15f3597bc7936bd179653684f6e380c4c1cb43560ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
