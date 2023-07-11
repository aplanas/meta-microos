SUMMARY = "Binary files of lacheck"
DESCRIPTION = "Binary files of lacheck"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-lacheck-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "57df8e771463c370a89e6aeedf5e77cb59a38001f3f55adbbb8de1e0bcbf2b7269259fe0b0db60aef63421b75392fbf7540855938b3123e5a999f2ae01daac7e"

RPROVIDES:${PN} += "texlive-lacheck-bin"

RDEPENDS:${PN} += "libc.so.6 \
texlive-lacheck"

inherit rpm
