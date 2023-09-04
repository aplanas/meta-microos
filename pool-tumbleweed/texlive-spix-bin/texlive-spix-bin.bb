SUMMARY = "Binary files of spix"
DESCRIPTION = "Binary files of spix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55933"

RPM_NAME = "texlive-spix-bin-2023.20230311.svn55933-93.2.aarch64.rpm"
RPM_HASH = "dde1cccb46372391e4e40680f71e55a82751cd239eda3e0882b7c3535f0aed9fa6293a3b2fff9c3be178def66e9e21bf219305c0e13e3c2139c44fbd9386a7ba"

RPROVIDES:${PN} += "texlive-spix-bin"

RDEPENDS:${PN} += "texlive-spix"

inherit rpm
