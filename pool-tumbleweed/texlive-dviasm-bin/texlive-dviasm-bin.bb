SUMMARY = "Binary files of dviasm"
DESCRIPTION = "Binary files of dviasm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8329"

RPM_NAME = "texlive-dviasm-bin-2023.20230311.svn8329-91.1.aarch64.rpm"
RPM_HASH = "ed1905e6f43d44e7141cba0bfbb6bdd0f82d981b988c57449c8af5da7edc380240ddb87ed24a3a97c3b545f6e40789487890e5cf84844204d7cb73d96caaf175"

RPROVIDES:${PN} += "texlive-dviasm-bin \
texlive-dviasm-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-dviasm"

inherit rpm
