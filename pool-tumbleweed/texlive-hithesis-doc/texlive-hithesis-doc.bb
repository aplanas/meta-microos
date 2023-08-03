SUMMARY = "Documentation for texlive-hithesis"
DESCRIPTION = "This package includes the documentation for texlive-hithesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.11svn64005"

RPM_NAME = "texlive-hithesis-doc-2023.209.2.0.11svn64005-54.1.noarch.rpm"
RPM_HASH = "a70c4aadeb772cc91730f0e2f794caaead71ed7f65b2fbe98a555349ad33766a5f5d0eff3d8a1d748d894eacee4e78540fc3de7257221bd4718cad368e6331e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hithesis-doc-zh \
texlive-hithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
