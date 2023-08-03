SUMMARY = "Documentation for texlive-almendra"
DESCRIPTION = "This package includes the documentation for texlive-almendra"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64539"

RPM_NAME = "texlive-almendra-doc-2023.209.svn64539-55.1.noarch.rpm"
RPM_HASH = "feec19e6792725382b669e55e2fccb120f02aaa2411fe779b73a86ffca3539c60f0257b2964d893b3ff2c1cc6150da62107f7d86bbe50cb4e4a4efccdfee7e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-almendra-doc"

RDEPENDS:${PN} += ""

inherit rpm
