SUMMARY = "Binary files of detex"
DESCRIPTION = "Binary files of detex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-detex-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "6d38401b892639d5aba5f780357e319ba34d7b096efe594906bd771a379353b28eab16bbea4327f3f2b7dee565c197e37ba6e938b93944374cabfc45bc0868e0"

RPROVIDES:${PN} += "texlive-detex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-detex"

inherit rpm
