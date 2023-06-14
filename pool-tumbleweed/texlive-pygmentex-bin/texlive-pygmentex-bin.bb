SUMMARY = "Binary files of pygmentex"
DESCRIPTION = "Binary files of pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34996"

RPM_NAME = "texlive-pygmentex-bin-2023.20230311.svn34996-91.1.aarch64.rpm"
RPM_HASH = "071ab9b2256893e03ad28193ca588987cb8613e8be57ea76e0f1d5441796c41dab2991d908df9db9524bf2c86cc98d6da325daf29ab3b795599efda78e55bd69"

RPROVIDES:${PN} += "texlive-pygmentex-bin"

RDEPENDS:${PN} += "texlive-pygmentex"

inherit rpm
