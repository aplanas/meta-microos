SUMMARY = "Binary files of ltximg"
DESCRIPTION = "Binary files of ltximg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32346"

RPM_NAME = "texlive-ltximg-bin-2023.20230311.svn32346-91.1.aarch64.rpm"
RPM_HASH = "d6883379f0b14539388388c3b03ffdb8b67fe9da81d522e4c9fa9d37b349d558c752b95de106cd80cc090e973621000ea0f816b5954cf1290a8c1bd23854acc0"

RPROVIDES:${PN} += "texlive-ltximg-bin"

RDEPENDS:${PN} += "texlive-ltximg"

inherit rpm
