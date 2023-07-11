SUMMARY = "Documentation for texlive-idxcmds"
DESCRIPTION = "This package includes the documentation for texlive-idxcmds"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-doc-2023.208.0.0.2csvn54554-53.1.noarch.rpm"
RPM_HASH = "dad7c422d27f27418c0df2692e8f88c35179403a74a85263ff08d2866a3c2afe57aa9bb095257afbf3f100359c79f79586d71e633aacd566fc1d392c084cb666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-idxcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
