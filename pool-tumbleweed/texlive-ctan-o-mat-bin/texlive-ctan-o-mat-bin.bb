SUMMARY = "Binary files of ctan-o-mat"
DESCRIPTION = "Binary files of ctan-o-mat"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46996"

RPM_NAME = "texlive-ctan-o-mat-bin-2023.20230311.svn46996-91.1.aarch64.rpm"
RPM_HASH = "ad3b5c1eb31b308aeb6d762d4c272fc131de408d66dd32e6c2bf3647d8b9e4ebfbf4bab130926c6f07c7cb12b9884d34419e246182dbaced4d760064e4435483"

RPROVIDES:${PN} += "texlive-ctan-o-mat-bin"

RDEPENDS:${PN} += "texlive-ctan-o-mat"

inherit rpm
