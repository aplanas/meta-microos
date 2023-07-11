SUMMARY = "Binary files of rubik"
DESCRIPTION = "Binary files of rubik"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32919"

RPM_NAME = "texlive-rubik-bin-2023.20230311.svn32919-92.1.aarch64.rpm"
RPM_HASH = "1c54e2e2c7a7c90f851835bc45be5813a5e61b4b83f1beb9448f95d663e8d66a26dd3b0a544aa65bc24a4493763bdb6fc16c85f37c308f2e9a99c7bae62c5e95"

RPROVIDES:${PN} += "texlive-rubik-bin"

RDEPENDS:${PN} += "texlive-rubik"

inherit rpm
