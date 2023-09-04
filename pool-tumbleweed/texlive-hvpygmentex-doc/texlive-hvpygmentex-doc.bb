SUMMARY = "Documentation for texlive-hvpygmentex"
DESCRIPTION = "This package includes the documentation for texlive-hvpygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-doc-2023.209.0.0.01svn62405-54.1.noarch.rpm"
RPM_HASH = "6dd14a2f0150240124f20b93c7253ec1ca552cd5d6d6a58100a0ae1ad7919e8bc948a5f0fd37c9c20a91ad05f895f63c8e6898b0e7847e52a0e4148a80a36891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvpygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
