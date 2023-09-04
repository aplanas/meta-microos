SUMMARY = "Binary files of make4ht"
DESCRIPTION = "Binary files of make4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37750"

RPM_NAME = "texlive-make4ht-bin-2023.20230311.svn37750-93.2.aarch64.rpm"
RPM_HASH = "d30b0854cb2b28b28af88813ca4499775cf0c6b7c3d39bb3f84fb8cf33cf03565d359137c2c59869badead59aa27cb6ada357764bb12028892e95d76df95c80b"

RPROVIDES:${PN} += "texlive-make4ht-bin"

RDEPENDS:${PN} += "texlive-make4ht"

inherit rpm
