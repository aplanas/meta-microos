SUMMARY = "Documentation for texlive-ukbill"
DESCRIPTION = "This package includes the documentation for texlive-ukbill"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn65485"

RPM_NAME = "texlive-ukbill-doc-2023.209.1.0.2svn65485-54.1.noarch.rpm"
RPM_HASH = "eca0c5d3ed009701b2d42469dc9efc5081ec4741f63b0143bbf201ae78ca2e6ddda835c3b966f05641583838d48366a485413fc8627d3dfb5981ecb507065fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ukbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
