SUMMARY = "Documentation for texlive-hatching"
DESCRIPTION = "This package includes the documentation for texlive-hatching"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.11svn23818"

RPM_NAME = "texlive-hatching-doc-2023.201.0.0.11svn23818-53.2.noarch.rpm"
RPM_HASH = "bcc9a4ff8996c6795767fae0148934151ecb85f092ef9fcff952f774dcba861d448ec57505b3e33cda8e1ccde8415856b459aa34638e193e36997b377725e3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hatching-doc"

RDEPENDS:${PN} += ""

inherit rpm
