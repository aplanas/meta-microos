SUMMARY = "Documentation for texlive-archaic"
DESCRIPTION = "This package includes the documentation for texlive-archaic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38005"

RPM_NAME = "texlive-archaic-doc-2023.201.svn38005-54.1.noarch.rpm"
RPM_HASH = "b8dc0d0c607537a5333fe58de23e536ee86751404a1cb336a5b0e92b30ed7fa5707f177123b165c1dacf9078acfb3b4303f01dd1ac08ff057d22a971ae4b065b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archaic-doc"
RDEPENDS:${PN} += ""

inherit rpm
