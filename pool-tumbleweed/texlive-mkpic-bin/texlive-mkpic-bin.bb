SUMMARY = "Binary files of mkpic"
DESCRIPTION = "Binary files of mkpic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33688"

RPM_NAME = "texlive-mkpic-bin-2023.20230311.svn33688-92.1.aarch64.rpm"
RPM_HASH = "ee4b77cee177e06aada14ecab87bb661dc0335e8bba7c042adab6fde9c2a71304b2159b0c7a95011b51ae2563ce7e10f40270b8068cc4dfaba10c4a3b74688b5"

RPROVIDES:${PN} += "texlive-mkpic-bin"

RDEPENDS:${PN} += "texlive-mkpic"

inherit rpm
