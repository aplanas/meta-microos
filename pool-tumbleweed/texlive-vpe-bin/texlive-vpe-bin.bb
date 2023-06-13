SUMMARY = "Binary files of vpe"
DESCRIPTION = "Binary files of vpe"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6897"

RPM_NAME = "texlive-vpe-bin-2023.20230311.svn6897-91.1.aarch64.rpm"
RPM_HASH = "3740973eb7701fd980fe8f80b71daca00f955217c74ad63cf81bce40528dd23c214ca03c80f1b9d196291cf3d2258610098dd36a3164f0d44ce558823f07fdd3"

RPROVIDES:${PN} += "texlive-vpe-bin \
texlive-vpe-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-vpe"

inherit rpm
