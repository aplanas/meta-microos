SUMMARY = "Binary files of a2ping"
DESCRIPTION = "Binary files of a2ping"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27321"

RPM_NAME = "texlive-a2ping-bin-2023.20230311.svn27321-92.1.aarch64.rpm"
RPM_HASH = "6f2edec5a2f9827ecf017c4e57fdb2e99453f796bcc23c4fb7207e9f6ae9a0b0998a482ea7f60a654f5dd83925fc3aa2685ed38c691754edb0b1ef45f78bfd11"

RPROVIDES:${PN} += "texlive-a2ping-bin"

RDEPENDS:${PN} += "texlive-a2ping"

inherit rpm
