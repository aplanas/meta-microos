SUMMARY = "Documentation for texlive-dashbox"
DESCRIPTION = "This package includes the documentation for texlive-dashbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn23425"

RPM_NAME = "texlive-dashbox-doc-2023.209.1.14svn23425-55.1.noarch.rpm"
RPM_HASH = "5ff9c3511260627a9466a32129a7dee5cb24d6838e5710f2c6ded2c2ce6398c8292002e31cfaae30141106270a76bd6b816d96cb28153f6bc00faf8a876ee74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
