SUMMARY = "Binary files of jfmutil"
DESCRIPTION = "Binary files of jfmutil"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44835"

RPM_NAME = "texlive-jfmutil-bin-2023.20230311.svn44835-93.1.aarch64.rpm"
RPM_HASH = "94b9adebd2f3a28f0fa2c206cfad2111ccc0199aa0287f610ec440c9b8b354277960e8d33b61b416aa64036e2477354df40d22b120149bbce0c4f8026aa16902"

RPROVIDES:${PN} += "texlive-jfmutil-bin"

RDEPENDS:${PN} += "texlive-jfmutil"

inherit rpm
