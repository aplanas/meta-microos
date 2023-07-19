SUMMARY = "Binary files of bundledoc"
DESCRIPTION = "Binary files of bundledoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17794"

RPM_NAME = "texlive-bundledoc-bin-2023.20230311.svn17794-93.1.aarch64.rpm"
RPM_HASH = "198ceea053f9a9aac81792c6649561488684e66d62b6172c281c5d424f92b59d94fe22ce8b453644ccf614e790b8b44f637b82edf8642eb4f8b7d14a25742392"

RPROVIDES:${PN} += "texlive-bundledoc-bin"

RDEPENDS:${PN} += "texlive-bundledoc"

inherit rpm
