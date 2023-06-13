SUMMARY = "Binary files of multibibliography"
DESCRIPTION = "Binary files of multibibliography"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30534"

RPM_NAME = "texlive-multibibliography-bin-2023.20230311.svn30534-91.1.aarch64.rpm"
RPM_HASH = "ece5f285aec5840c5fdd8ae35af928b3edec38248a5d4df44d2dfb2491f837260e7b8fb223adbf482b96be2fae9466e66c86a71bdb3949919d6834d2baa92403"

RPROVIDES:${PN} += "texlive-multibibliography-bin \
texlive-multibibliography-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-multibibliography"

inherit rpm
