SUMMARY = "Busybox applets replacing telnet"
DESCRIPTION = "This package contains the symlinks to provide telnet with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-telnet-1.36.0-26.3.noarch.rpm"
RPM_HASH = "1f7321d793974542c298fcf43b9a5883ef81db36de7bf42e988f80c76034ecb1e9c149c99d4bc93ceed6be1d12ab797f93c9997ce95c6c8fd94251f09988eadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-telnet"

RDEPENDS:${PN} += "busybox"

inherit rpm
