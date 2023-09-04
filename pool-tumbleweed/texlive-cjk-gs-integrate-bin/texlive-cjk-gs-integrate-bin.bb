SUMMARY = "Binary files of cjk-gs-integrate"
DESCRIPTION = "Binary files of cjk-gs-integrate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37223"

RPM_NAME = "texlive-cjk-gs-integrate-bin-2023.20230311.svn37223-93.2.aarch64.rpm"
RPM_HASH = "da46f9e9c3d8cc10ca73a527e7aa1bdf09c2fcaaff667f3b63829f4d4bd4f609b394fa31c5b7e0d413c764ef58e85a9e2ee31ae2959ca3edd909da0cf8bfca08"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-bin"

RDEPENDS:${PN} += "texlive-cjk-gs-integrate"

inherit rpm
