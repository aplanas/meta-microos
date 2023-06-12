SUMMARY = "Busybox applets containing adduser and some shadow tools"
DESCRIPTION = "This package contains the symlinks for adduser and some tools from the \
shadow suite."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-adduser-1.36.0-26.3.noarch.rpm"
RPM_HASH = "7d9f40c8cc8716f4400cd0990d934a246ebb6c63f1b509e4d3d902b4fb12159b69eacaf921b1b1e759cb285837464c99b4a166d16329e392fd647736eab9d258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-adduser"
RDEPENDS:${PN} += "busybox \
group(nogroup)"

inherit rpm
