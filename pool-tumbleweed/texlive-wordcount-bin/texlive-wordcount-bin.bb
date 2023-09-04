SUMMARY = "Binary files of wordcount"
DESCRIPTION = "Binary files of wordcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46165"

RPM_NAME = "texlive-wordcount-bin-2023.20230311.svn46165-93.2.aarch64.rpm"
RPM_HASH = "654d1e5d7095ebb15de9f6f34b29df7b48f78a7e1b58286552d473ce96ca9276c62f643a37816c990bd7e5cdbb87160aff66bbb2acf4e35cf808c2a0e8f8f84a"

RPROVIDES:${PN} += "texlive-wordcount-bin"

RDEPENDS:${PN} += "texlive-wordcount"

inherit rpm
