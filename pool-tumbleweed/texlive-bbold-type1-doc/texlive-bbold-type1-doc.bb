SUMMARY = "Documentation for texlive-bbold-type1"
DESCRIPTION = "This package includes the documentation for texlive-bbold-type1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn33143"

RPM_NAME = "texlive-bbold-type1-doc-2023.201.svn33143-53.1.noarch.rpm"
RPM_HASH = "7fc70613b8fdd30a69894b679d35959ed6d89431abc79babe80f4bdfd29e9bf4bc354d3dd3a1bfe60280b94ad6918aecdb7f32bf59ce66534b91ffcfede3dcde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbold-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
