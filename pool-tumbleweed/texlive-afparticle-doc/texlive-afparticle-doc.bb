SUMMARY = "Documentation for texlive-afparticle"
DESCRIPTION = "This package includes the documentation for texlive-afparticle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn35900"

RPM_NAME = "texlive-afparticle-doc-2023.209.1.3svn35900-55.1.noarch.rpm"
RPM_HASH = "4a4047df09735ac35e2952aa989e50220e42fe51e3ce8f75251a553a8e9e2d0720bbbce4a4cc22d6f32d95ccb537ce26f37507ed77964dada9403600c0f46af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-afparticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
