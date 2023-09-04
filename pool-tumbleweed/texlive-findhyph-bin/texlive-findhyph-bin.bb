SUMMARY = "Binary files of findhyph"
DESCRIPTION = "Binary files of findhyph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14758"

RPM_NAME = "texlive-findhyph-bin-2023.20230311.svn14758-93.2.aarch64.rpm"
RPM_HASH = "e758368864bba35928327b7ca6b489650dd98f3bd9cf29de27927a46cfe7d100519a8dafecb6c6e4be2a40b4171a8a945c4b682beac5bab3a3ecee211d330292"

RPROVIDES:${PN} += "texlive-findhyph-bin"

RDEPENDS:${PN} += "texlive-findhyph"

inherit rpm
