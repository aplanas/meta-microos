SUMMARY = "Documentation for texlive-einfart"
DESCRIPTION = "This package includes the documentation for texlive-einfart"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-einfart-doc-2023.209.svn65475-54.2.noarch.rpm"
RPM_HASH = "8fd440947a1e8fde54e72cfb62d70e315b09136ac2582cdcfb044480669aa8d5046a1f79a873bcd3eb7da520b47e657a6b4584461205abf5c8c4092ec5c51c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-einfart-doc"

RDEPENDS:${PN} += ""

inherit rpm
