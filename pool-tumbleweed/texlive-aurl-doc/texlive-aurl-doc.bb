SUMMARY = "Documentation for texlive-aurl"
DESCRIPTION = "This package includes the documentation for texlive-aurl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn41853"

RPM_NAME = "texlive-aurl-doc-2023.209.svn41853-54.1.noarch.rpm"
RPM_HASH = "c7c9a2508cbf16b7490befcc7c0d79bf955fd8051738133e3980e08ffff87591385e4868779547e85c94491fa31e87ae443873a0e9ea07936165c299b0de6aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
