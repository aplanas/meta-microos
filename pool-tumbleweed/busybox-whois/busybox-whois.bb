SUMMARY = "Busybox applets replacing whois"
DESCRIPTION = "This package contains the symlinks to replace whois with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-whois-1.36.1-27.1.noarch.rpm"
RPM_HASH = "415dc99189a810991665658591ee608afaa746f0ecff36f11a7fb845b3c49d5ed71453ae15dbae36ad9ee1f14ebe7ac7b03ee1d73938ceaca86d710c2228a10f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-whois"

RDEPENDS:${PN} += "busybox"

inherit rpm
