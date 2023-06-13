SUMMARY = "Binary files of cslatex"
DESCRIPTION = "Binary files of cslatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-cslatex-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "934fb15df54b6e0243a86a781a05dce3137ac7979d66da7b0b1de504f44fec2614434e7e180efe0a85f2ec64944c62c062ace91c8b380fd209998bc18e083a13"

RPROVIDES:${PN} += "texlive-cslatex-bin \
texlive-cslatex-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-cslatex"

inherit rpm
