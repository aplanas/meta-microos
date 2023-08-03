SUMMARY = "Documentation for texlive-schulschriften"
DESCRIPTION = "This package includes the documentation for texlive-schulschriften"
LICENSE = "LPPL-1.0"

PV = "2023.209.5svn59388"

RPM_NAME = "texlive-schulschriften-doc-2023.209.5svn59388-54.1.noarch.rpm"
RPM_HASH = "0b3a499af22885a5168bf66f6151dc3e7a4e9d08f78ec4ab4a3337dc9e80e2f4418b301ca5f706a36ad86b82110d9a6db2c5fba2618c435b8cf5c895117efd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schulschriften-doc"

RDEPENDS:${PN} += ""

inherit rpm
