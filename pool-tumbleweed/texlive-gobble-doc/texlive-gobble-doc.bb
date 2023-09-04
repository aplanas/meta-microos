SUMMARY = "Documentation for texlive-gobble"
DESCRIPTION = "This package includes the documentation for texlive-gobble"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn64967"

RPM_NAME = "texlive-gobble-doc-2023.209.0.0.2svn64967-54.2.noarch.rpm"
RPM_HASH = "fce0e5194cae11dad843a482b19a12d8799e423da16f227225eeae41ad618055f39567e5512def434994d7f38df0957cdb72d4a40de55809e251ec2deac9ac44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gobble-doc"

RDEPENDS:${PN} += ""

inherit rpm
