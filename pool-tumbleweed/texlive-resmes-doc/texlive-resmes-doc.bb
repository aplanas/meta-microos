SUMMARY = "Documentation for texlive-resmes"
DESCRIPTION = "This package includes the documentation for texlive-resmes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65375"

RPM_NAME = "texlive-resmes-doc-2023.209.1.0svn65375-54.2.noarch.rpm"
RPM_HASH = "f60054653992a01615267956521ee5f5012ec5ddb54b4cbcea23a71b1c661b83e82856a33a4a349caf897e9d6d15618c1ee3dcb62bd35f2fb918b7f127f5aa48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resmes-doc"

RDEPENDS:${PN} += ""

inherit rpm
