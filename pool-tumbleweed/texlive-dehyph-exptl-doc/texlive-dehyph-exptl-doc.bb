SUMMARY = "Documentation for texlive-dehyph-exptl"
DESCRIPTION = "This package includes the documentation for texlive-dehyph-exptl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn66390"

RPM_NAME = "texlive-dehyph-exptl-doc-2023.209.0.0.9svn66390-53.1.noarch.rpm"
RPM_HASH = "2314e788d7ecf3c0ff8b2a0d6bea22eb1cec9df8b3de484959c4ae2494ad6471879b7bdbc1dddd0c314f3c707a684f6950a0fa07448d3ec43af7acda91f58d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dehyph-exptl-doc-de \
texlive-dehyph-exptl-doc"

RDEPENDS:${PN} += ""

inherit rpm
