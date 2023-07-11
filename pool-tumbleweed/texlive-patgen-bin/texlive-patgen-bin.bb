SUMMARY = "Binary files of patgen"
DESCRIPTION = "Binary files of patgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-patgen-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "b4e82fb7a59252ebe5f8f9047730e73df3b50ffc4d815bd651d61f1103e786c41a351e6e047be3d147d840330729dc92ca744211bec39d74c54516eda2658303"

RPROVIDES:${PN} += "texlive-patgen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-patgen"

inherit rpm
