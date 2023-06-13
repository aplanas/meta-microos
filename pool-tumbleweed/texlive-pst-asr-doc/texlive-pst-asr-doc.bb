SUMMARY = "Documentation for texlive-pst-asr"
DESCRIPTION = "This package includes the documentation for texlive-pst-asr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn22138"

RPM_NAME = "texlive-pst-asr-doc-2023.201.1.3svn22138-52.1.noarch.rpm"
RPM_HASH = "da0c75eb641ff32576aa2f7a4de690b20026f57d55bc0ead7d4904a736f17d736b9cf95c92a00bc5e1c8399867f719a0ba98857e5b0bb454e04ffb9d294c1e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-asr-doc"

RDEPENDS:${PN} += ""

inherit rpm
