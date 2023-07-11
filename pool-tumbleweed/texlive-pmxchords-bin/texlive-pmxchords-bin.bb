SUMMARY = "Binary files of pmxchords"
DESCRIPTION = "Binary files of pmxchords"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32405"

RPM_NAME = "texlive-pmxchords-bin-2023.20230311.svn32405-92.1.aarch64.rpm"
RPM_HASH = "238cfe016c6e54e7428b685441cc0d60d8291e2724d9bac8a7c4e09ba4bf3f953fd7765f5696d5de5b811701f0006b5ab31e126e01e41c443e5004ffc71e8baa"

RPROVIDES:${PN} += "texlive-pmxchords-bin"

RDEPENDS:${PN} += "texlive-pmxchords"

inherit rpm
