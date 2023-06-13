SUMMARY = "Binary files of csplain"
DESCRIPTION = "Binary files of csplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50528"

RPM_NAME = "texlive-csplain-bin-2023.20230311.svn50528-91.1.aarch64.rpm"
RPM_HASH = "00b6772786f0e6d83a5071505d67a5705ff1a2e1f89f6d9653785c7a873dd660116930f8b3699fcb61921fc9b4b735fb7e92199045f8c9c35995194750b35512"

RPROVIDES:${PN} += "texlive-csplain-bin \
texlive-csplain-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-csplain"

inherit rpm
