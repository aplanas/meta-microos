SUMMARY = "Documentation for texlive-bbm"
DESCRIPTION = "This package includes the documentation for texlive-bbm"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-bbm-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "182e0871be2a00822f3f7456e68e97d5050b37c2f8a268ae630d4d493151bdaaaa211bd2f19aa23200b2735de1f766c3581d1cf0699db79f22a35ef39317b98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbm-doc"

RDEPENDS:${PN} += ""

inherit rpm
