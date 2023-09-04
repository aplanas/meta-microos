SUMMARY = "Binary files of mkpic"
DESCRIPTION = "Binary files of mkpic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33688"

RPM_NAME = "texlive-mkpic-bin-2023.20230311.svn33688-93.2.aarch64.rpm"
RPM_HASH = "6a55a48eeacb259792b4f92e44da5148176d24a88c8c11d3e22d389d2610711844d8ba051c2dc3b4952a86fa83b9b3ff2792bbba32d66ee221c27cb4a91b25c1"

RPROVIDES:${PN} += "texlive-mkpic-bin"

RDEPENDS:${PN} += "texlive-mkpic"

inherit rpm
