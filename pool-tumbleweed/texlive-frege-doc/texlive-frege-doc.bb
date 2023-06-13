SUMMARY = "Documentation for texlive-frege"
DESCRIPTION = "This package includes the documentation for texlive-frege"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn27417"

RPM_NAME = "texlive-frege-doc-2023.201.1.3svn27417-52.1.noarch.rpm"
RPM_HASH = "822c68527551da1be64267fd4f8a40575a0d7f35152f0d3c255a150dab6ea6278221ee1cdba14d6a13a76a5d0ed2122a8363f8b08fc01ebfd237844dedec7978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frege-doc"

RDEPENDS:${PN} += ""

inherit rpm
