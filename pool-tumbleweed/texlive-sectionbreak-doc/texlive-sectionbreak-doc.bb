SUMMARY = "Documentation for texlive-sectionbreak"
DESCRIPTION = "This package includes the documentation for texlive-sectionbreak"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1dsvn50339"

RPM_NAME = "texlive-sectionbreak-doc-2023.209.0.0.1dsvn50339-54.1.noarch.rpm"
RPM_HASH = "84f8769663ddb0bbc1e3ce4f16256fa67f4b25643e1a1549101415e394bc8e00b27bcbd7753692b5aa43eb7657cc05c7cb8a57d935afe7f7260c70c8311e03c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectionbreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
