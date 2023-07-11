SUMMARY = "Binary files of upmendex"
DESCRIPTION = "Binary files of upmendex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-upmendex-bin-2023.20230311.svn66511-92.1.aarch64.rpm"
RPM_HASH = "6019f8681bb779277c2dbad5fd61844d6777aa19d8c75aca0c6a99521e1c8ba3fb5fda166960db3de73f1d84b1cf9d0061ad249d544fd898c75a3063ac430967"

RPROVIDES:${PN} += "texlive-upmendex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libkpathsea.so.6 \
texlive-upmendex"

inherit rpm
