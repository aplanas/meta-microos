SUMMARY = "Binary files of context"
DESCRIPTION = "Binary files of context"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66562"

RPM_NAME = "texlive-context-bin-2023.20230311.svn66562-93.2.aarch64.rpm"
RPM_HASH = "946b8065bdbc9fe69f55eef209b4e998964510a405ac3c398d102ddd6c86943ac0ed26f11bce0b5cfff32d924979b86b1d65424d819304fc89a0744ff56b8079"

RPROVIDES:${PN} += "texlive-context-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-context"

inherit rpm
