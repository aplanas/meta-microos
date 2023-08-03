SUMMARY = "Documentation for texlive-dtxdescribe"
DESCRIPTION = "This package includes the documentation for texlive-dtxdescribe"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.07svn65445"

RPM_NAME = "texlive-dtxdescribe-doc-2023.209.1.07svn65445-53.1.noarch.rpm"
RPM_HASH = "08c209316bcc608fbf349ec1c06f56b3898e29ebbb66b83d381f63746b2923dc743b3a7116915df96ad3fb27f5236d9c73b9c75113dcdf8eb3727fc7b0a17ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxdescribe-doc"

RDEPENDS:${PN} += ""

inherit rpm
