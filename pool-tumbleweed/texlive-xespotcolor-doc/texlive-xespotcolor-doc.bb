SUMMARY = "Documentation for texlive-xespotcolor"
DESCRIPTION = "This package includes the documentation for texlive-xespotcolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-doc-2023.209.2.1svn58212-53.2.noarch.rpm"
RPM_HASH = "cefde3f67e8c7d77d1ef1cdf64749481a7aadcd3cfdc8eac37503c4cf87d1b86778e2d699ba36b9f27cdb3e77c1792aade0aeb284ec1d8bd84c4851c5954bd31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xespotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
