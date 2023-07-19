SUMMARY = "Binary files of ctan-o-mat"
DESCRIPTION = "Binary files of ctan-o-mat"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46996"

RPM_NAME = "texlive-ctan-o-mat-bin-2023.20230311.svn46996-93.1.aarch64.rpm"
RPM_HASH = "ae993de57872122c8ca2370eb34930f7fb3270986097062188bc35cd047c763f6b07a7e9ee2bfb4e438e40f250250fb02e64f9c4908f2bdcede1832215bf382f"

RPROVIDES:${PN} += "texlive-ctan-o-mat-bin"

RDEPENDS:${PN} += "texlive-ctan-o-mat"

inherit rpm
