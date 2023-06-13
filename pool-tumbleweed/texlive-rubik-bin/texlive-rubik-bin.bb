SUMMARY = "Binary files of rubik"
DESCRIPTION = "Binary files of rubik"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32919"

RPM_NAME = "texlive-rubik-bin-2023.20230311.svn32919-91.1.aarch64.rpm"
RPM_HASH = "2f63c25f8cd761c3b95cb159dfea8445f1deeb3356cf91c9fb9a8bc6821e286c3117cea66482f20a7e10b09da3b0960ac40275a39dbd5112e1e1696221f0c4f7"

RPROVIDES:${PN} += "texlive-rubik-bin \
texlive-rubik-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-rubik"

inherit rpm
