SUMMARY = "Binary files of exceltex"
DESCRIPTION = "Binary files of exceltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25860"

RPM_NAME = "texlive-exceltex-bin-2023.20230311.svn25860-93.2.aarch64.rpm"
RPM_HASH = "726f8ead662b4e39634d4003854d5fc2ec4cacecea7660724305fe7c8ae4fa126f0810d4da802b012a15c1785b1436c0909c3b9f5c017fa6eb15ba4103e7d9e1"

RPROVIDES:${PN} += "texlive-exceltex-bin"

RDEPENDS:${PN} += "texlive-exceltex"

inherit rpm
