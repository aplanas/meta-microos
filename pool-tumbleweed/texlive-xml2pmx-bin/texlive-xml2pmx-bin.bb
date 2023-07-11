SUMMARY = "Binary files of xml2pmx"
DESCRIPTION = "Binary files of xml2pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xml2pmx-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "1b470d16723928e580ab775724e2f46d37341b3f564da856fe4a1cd94ddc9ffb1bb33eacf03675a06f53d930553f4c1e0e1365abcf4e59e6af83d6f057ecd394"

RPROVIDES:${PN} += "texlive-xml2pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-xml2pmx"

inherit rpm
