SUMMARY = "Binary files of srcredact"
DESCRIPTION = "Binary files of srcredact"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38710"

RPM_NAME = "texlive-srcredact-bin-2023.20230311.svn38710-93.2.aarch64.rpm"
RPM_HASH = "c78e598d3d557f3ab0ce1978cefd2e002bcfcdcf06cff502ec12dcedefdd74e749ece582e49190cf000634b128cba6a02db081ac017287d0de6bbe1feb99df22"

RPROVIDES:${PN} += "texlive-srcredact-bin"

RDEPENDS:${PN} += "texlive-srcredact"

inherit rpm
