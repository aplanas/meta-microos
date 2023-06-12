SUMMARY = "Binary files of mkgrkindex"
DESCRIPTION = "Binary files of mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14428"

RPM_NAME = "texlive-mkgrkindex-bin-2023.20230311.svn14428-91.1.aarch64.rpm"
RPM_HASH = "bef80c875475938bc1b661535c5770cae7fba4d61f9a98bca6820d4b270fd64a7456ac0f9d3e93614b63a1d30d15827b1b662889ee0a6fdaf037cdb4b5489854"

RPROVIDES:${PN} += "texlive-mkgrkindex-bin \
texlive-mkgrkindex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mkgrkindex"

inherit rpm
