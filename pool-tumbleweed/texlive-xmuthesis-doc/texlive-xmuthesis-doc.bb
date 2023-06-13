SUMMARY = "Documentation for texlive-xmuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xmuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-doc-2023.201.0.0.4.1svn56614-52.1.noarch.rpm"
RPM_HASH = "7830abc16cd8929ced724dc12ab9274e3f44ecc84831d8529bcc47783ac38b1927ad0467c948a641c3f8cddd68aedae81cc88b8b93397fe56373f81f8a9bac66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
