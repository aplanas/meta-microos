SUMMARY = "Documentation for texlive-suanpan"
DESCRIPTION = "This package includes the documentation for texlive-suanpan"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-suanpan-doc-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "ba31454f900420a129cdce9a4008fa1f44bf9dd6bfec0294f17188a671bb167f9e0d4a4d3ba8cb47f4cae6bf36bc8f1a6d42af2466791a0ace1f533387d65faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suanpan-doc"

RDEPENDS:${PN} += ""

inherit rpm
