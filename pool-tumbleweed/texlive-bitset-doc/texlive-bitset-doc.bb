SUMMARY = "Documentation for texlive-bitset"
DESCRIPTION = "This package includes the documentation for texlive-bitset"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53837"

RPM_NAME = "texlive-bitset-doc-2023.201.1.3svn53837-52.1.noarch.rpm"
RPM_HASH = "fc5229864b2e2e390e94d78e3ad72001dd74e41b856b6cf531f4a07615fc3cc49b50d15fd0d3339f3814cf97d576320a8587b6c73260f42c0c28599959d09ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitset-doc"

RDEPENDS:${PN} += ""

inherit rpm
