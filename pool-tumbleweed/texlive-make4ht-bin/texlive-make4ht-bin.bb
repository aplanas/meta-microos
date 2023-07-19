SUMMARY = "Binary files of make4ht"
DESCRIPTION = "Binary files of make4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37750"

RPM_NAME = "texlive-make4ht-bin-2023.20230311.svn37750-93.1.aarch64.rpm"
RPM_HASH = "8a0104ec5bf1c642c2cc310f6af52c2e36423e046700cbfac2911cd390a002555b38e3613ac0b413f8c182294e6a90dd158962f2a32f1594d36b24fcb4c7d31b"

RPROVIDES:${PN} += "texlive-make4ht-bin"

RDEPENDS:${PN} += "texlive-make4ht"

inherit rpm
