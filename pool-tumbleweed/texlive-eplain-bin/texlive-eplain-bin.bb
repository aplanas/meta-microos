SUMMARY = "Binary files of eplain"
DESCRIPTION = "Binary files of eplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-eplain-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "0d974763cecdc87f4febc8926c26cc27bd466925be6163928ded489ef0477d86e77f90701c5a89ff28fc43a625abd1d6a31fcd5072768eb88bcc63cdbc2bbeab"

RPROVIDES:${PN} += "texlive-eplain-bin"

RDEPENDS:${PN} += "texlive-eplain"

inherit rpm
