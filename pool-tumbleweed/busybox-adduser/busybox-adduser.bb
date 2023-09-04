SUMMARY = "Busybox applets containing adduser and some shadow tools"
DESCRIPTION = "This package contains the symlinks for adduser and some tools from the \
shadow suite."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-adduser-1.36.1-28.1.noarch.rpm"
RPM_HASH = "10f47dd2c0ecb5d9065f72fefc1c9d48e874e182f01eb34a4267f3a863ff723e6d7b9cf73d0d7e32c26bcc0cfbb82db9081292c8d2fa9c9b5c76a1ed2105c6da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-adduser"

RDEPENDS:${PN} += "busybox \
group-nogroup"

inherit rpm
