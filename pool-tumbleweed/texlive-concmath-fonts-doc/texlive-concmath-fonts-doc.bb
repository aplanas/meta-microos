SUMMARY = "Documentation for texlive-concmath-fonts"
DESCRIPTION = "This package includes the documentation for texlive-concmath-fonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17218"

RPM_NAME = "texlive-concmath-fonts-doc-2023.201.svn17218-53.1.noarch.rpm"
RPM_HASH = "8c42092e0d82a15258b677c9a9af6fbc3bcf88f948d8be2035ae5f8ce0828af8d7471846b10d716d86f46e13ed0cb8b845c805b247b41f19dfafa9e6a4a5b130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
