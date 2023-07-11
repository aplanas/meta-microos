SUMMARY = "Documentation for texlive-hitex"
DESCRIPTION = "This package includes the documentation for texlive-hitex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65883"

RPM_NAME = "texlive-hitex-doc-2023.201.svn65883-53.2.noarch.rpm"
RPM_HASH = "e6ff5f45ecfffe9dd983d1b959dd0126c52e9e827a888711f9e78219904eb00fcb1d6463d38b4d8c10c477c5fd722a3b556497c61398d77bd2cf189fc615dc00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hishrink.1 \
man-histretch.1 \
man-hitex.1 \
texlive-hitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
