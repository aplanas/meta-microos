SUMMARY = "Documentation for texlive-context-animation"
DESCRIPTION = "This package includes the documentation for texlive-context-animation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-animation-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "db46dedfa6f55af2c771e0437db6421639d1312f7a3acc933d4bcc61992ce44f9435dbe58b171e9304007abe746706ab0098db0e9b362c18533ce31e7f312d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-animation-doc"

RDEPENDS:${PN} += ""

inherit rpm
