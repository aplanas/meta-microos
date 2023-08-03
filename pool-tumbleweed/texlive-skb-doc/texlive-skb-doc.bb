SUMMARY = "Documentation for texlive-skb"
DESCRIPTION = "This package includes the documentation for texlive-skb"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.52svn22781"

RPM_NAME = "texlive-skb-doc-2023.209.0.0.52svn22781-58.1.noarch.rpm"
RPM_HASH = "a34c44c1afe0b1296bbf2d46df9b26f539081a2466bd73d101dd3e556e0ef6330165c3725e5efbcf2f37ed9a211691f45f6a0c9400dbaa1239de378ff5cf2c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skb-doc"

RDEPENDS:${PN} += ""

inherit rpm
