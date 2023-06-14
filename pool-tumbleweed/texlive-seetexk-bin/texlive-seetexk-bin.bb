SUMMARY = "Binary files of seetexk"
DESCRIPTION = "Binary files of seetexk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-seetexk-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "1b54f37ffa5c4cac3fe495ca591401bfd299b16c68ac5218fba146e2a9e9789bf2d909a353ba8496029f8c8782ee19f2c41b6c1c7960956575e5c23990c0f6e5"

RPROVIDES:${PN} += "texlive-seetexk-bin"

RDEPENDS:${PN} += "/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-seetexk"

inherit rpm
