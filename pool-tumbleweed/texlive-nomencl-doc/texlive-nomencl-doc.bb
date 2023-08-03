SUMMARY = "Documentation for texlive-nomencl"
DESCRIPTION = "This package includes the documentation for texlive-nomencl"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.6svn61029"

RPM_NAME = "texlive-nomencl-doc-2023.209.5.6svn61029-55.1.noarch.rpm"
RPM_HASH = "bc6ab4f33578ed841a12c5cace62e25385a1d2f68d1c6130fd60dd2c2fdee5271fd5e0371af8cb228bd6b4ac7f833dddb970db14f3fe3b54f89c3c6a91268f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nomencl-doc"

RDEPENDS:${PN} += ""

inherit rpm
