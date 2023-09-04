SUMMARY = "Binary files of glossaries"
DESCRIPTION = "Binary files of glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37813"

RPM_NAME = "texlive-glossaries-bin-2023.20230311.svn37813-93.2.aarch64.rpm"
RPM_HASH = "fc754b7fbee37b976facbfabe91c578d4c100963f97dd06f876ba985d13cbe99237f561dedb2dee3cf9b647615f5f3e4d793ab051071a321eabf6092fc818159"

RPROVIDES:${PN} += "texlive-glossaries-bin"

RDEPENDS:${PN} += "texlive-glossaries"

inherit rpm
