SUMMARY = "Documentation for texlive-gu"
DESCRIPTION = "This package includes the documentation for texlive-gu"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-gu-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "4bdc59d378d614bf26b294ebcf8d4d8e69ed06d5a934c9d54f45de8741b282b507eeda233d186d6debe2c121b1222d493185d2f634ac09ffbd93a7aa6a9fb0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gu-doc-de \
texlive-gu-doc"

RDEPENDS:${PN} += ""

inherit rpm
