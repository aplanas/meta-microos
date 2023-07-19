SUMMARY = "Binary files of accfonts"
DESCRIPTION = "Binary files of accfonts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12688"

RPM_NAME = "texlive-accfonts-bin-2023.20230311.svn12688-93.1.aarch64.rpm"
RPM_HASH = "a98139f1290b99c3edc8192d678b00629c094190b57115af477642163ff15385e53619c060ac0814b53eb51ca1357f53b10fe95d2f58a8fddd05cea461d6f0c9"

RPROVIDES:${PN} += "texlive-accfonts-bin"

RDEPENDS:${PN} += "texlive-accfonts"

inherit rpm
