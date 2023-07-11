SUMMARY = "Documentation for texlive-roboto"
DESCRIPTION = "This package includes the documentation for texlive-roboto"
LICENSE = "Apache-1.0"

PV = "2023.201.svn64350"

RPM_NAME = "texlive-roboto-doc-2023.201.svn64350-53.2.noarch.rpm"
RPM_HASH = "86bfbb8eed42a1893d11e4e3e7c41de0dc88edb50448c965f89c24b0fd8b2c5d7063ace57a48556dc0b4298c45f72bcb21abe7c8412f053665489eba1063f63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roboto-doc"

RDEPENDS:${PN} += ""

inherit rpm
