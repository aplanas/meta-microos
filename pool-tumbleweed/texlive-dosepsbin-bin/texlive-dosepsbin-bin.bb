SUMMARY = "Binary files of dosepsbin"
DESCRIPTION = "Binary files of dosepsbin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24759"

RPM_NAME = "texlive-dosepsbin-bin-2023.20230311.svn24759-92.1.aarch64.rpm"
RPM_HASH = "0460130ab17aa96a32f2b9dd60a0ed7f0afeadbb022f792b4d146f98db9440c0c19255d281d6a10796e6891ae5f2d7c1bbabc6701e221424771db0a9fbe26809"

RPROVIDES:${PN} += "texlive-dosepsbin-bin"

RDEPENDS:${PN} += "texlive-dosepsbin"

inherit rpm
