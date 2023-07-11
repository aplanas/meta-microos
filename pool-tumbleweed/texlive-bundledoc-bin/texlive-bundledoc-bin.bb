SUMMARY = "Binary files of bundledoc"
DESCRIPTION = "Binary files of bundledoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17794"

RPM_NAME = "texlive-bundledoc-bin-2023.20230311.svn17794-92.1.aarch64.rpm"
RPM_HASH = "2ce84a2cfe16f3e0d50c47daf3df3a8cc989a2605c02c203db000269cb2bd4e6ba4e05b1f5abe8edcc95c422cdad4524b453735e8069ae6640efcc23f0fb6ce4"

RPROVIDES:${PN} += "texlive-bundledoc-bin"

RDEPENDS:${PN} += "texlive-bundledoc"

inherit rpm
