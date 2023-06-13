SUMMARY = "Documentation for texlive-cmexb"
DESCRIPTION = "This package includes the documentation for texlive-cmexb"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-cmexb-doc-2023.201.svn54074-53.1.noarch.rpm"
RPM_HASH = "9aa5d3e9e06033c440e5c741a1919fcecd77a072f8bf1466c1d6db1139c5c0a8b9be0e9b47bd3f4fca7a86658da9622b4a8c2524c44f71aacef7f10a26ef6e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmexb-doc"

RDEPENDS:${PN} += ""

inherit rpm
