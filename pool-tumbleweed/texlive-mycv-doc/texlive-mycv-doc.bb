SUMMARY = "Documentation for texlive-mycv"
DESCRIPTION = "This package includes the documentation for texlive-mycv"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.6svn26807"

RPM_NAME = "texlive-mycv-doc-2023.201.1.5.6svn26807-54.1.noarch.rpm"
RPM_HASH = "e28525b27a1c003aadd533795f4191f3f6d8edbc6c4e59fccf0651667d05c49ce69aecc70cddfa5e9e50db0e62580c29591c74236fb461fa331f0cc02f117439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mycv-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
