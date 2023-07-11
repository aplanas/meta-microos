SUMMARY = "Binary files of fragmaster"
DESCRIPTION = "Binary files of fragmaster"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-fragmaster-bin-2023.20230311.svn13663-92.1.aarch64.rpm"
RPM_HASH = "52264985f7814061478dca80d30dee0e7008a60bda6419b26fea1a79e9a5382f1b8aecd9c35b6f6e7d0798f698c2d6047c29ff41ad499736ef62a15824458510"

RPROVIDES:${PN} += "texlive-fragmaster-bin"

RDEPENDS:${PN} += "texlive-fragmaster"

inherit rpm
