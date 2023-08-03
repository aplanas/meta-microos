SUMMARY = "Documentation for texlive-jneurosci"
DESCRIPTION = "This package includes the documentation for texlive-jneurosci"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn17346"

RPM_NAME = "texlive-jneurosci-doc-2023.209.1.00svn17346-56.1.noarch.rpm"
RPM_HASH = "581911f21024b71067e7e20f7732d1f006bd3e5b170e6cd3612f9cf69707cebe964ad95d7edeb67eee0f52b6b5de64ed3e4203dc9a81e8add033efce60adad8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jneurosci-doc"

RDEPENDS:${PN} += ""

inherit rpm
