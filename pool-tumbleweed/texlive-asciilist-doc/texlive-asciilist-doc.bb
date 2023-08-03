SUMMARY = "Documentation for texlive-asciilist"
DESCRIPTION = "This package includes the documentation for texlive-asciilist"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2bsvn49060"

RPM_NAME = "texlive-asciilist-doc-2023.209.2.2bsvn49060-54.1.noarch.rpm"
RPM_HASH = "36f0067b36f068b5ce49cbc04f51294b3b6b82bb6728495ed47714586eabf5d9ba7db0539dae323105e6029da668853a6b2e618b7bbd11f4f5738a3f345d88b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asciilist-doc"

RDEPENDS:${PN} += ""

inherit rpm
