SUMMARY = "Binary files of texdoc"
DESCRIPTION = "Binary files of texdoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn47948"

RPM_NAME = "texlive-texdoc-bin-2023.20230311.svn47948-91.1.aarch64.rpm"
RPM_HASH = "255bd3bf6641b3e56778a8af67e89d2f4cdeb7585fb77e726c11221e007137e1cca15cdfef21188f5a41bbec3e074ec1e612abf24569e60b8d3006cd4b2e09bf"

RPROVIDES:${PN} += "texlive-texdoc-bin \
texlive-texdoc-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-texdoc"

inherit rpm
