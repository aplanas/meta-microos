SUMMARY = "Documentation for texlive-fourier"
DESCRIPTION = "This package includes the documentation for texlive-fourier"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn61937"

RPM_NAME = "texlive-fourier-doc-2023.209.2.3svn61937-53.1.noarch.rpm"
RPM_HASH = "3c4086723fbe15a707e490ed267a232882f976faffe6df975ca179e46f1a109b601f9201cc3ad1a05d7df244ef5508359a5e3be0c31487640582ca3b842092e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fourier-doc"

RDEPENDS:${PN} += ""

inherit rpm
