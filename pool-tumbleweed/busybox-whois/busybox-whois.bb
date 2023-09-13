SUMMARY = "Busybox applets replacing whois"
DESCRIPTION = "This package contains the symlinks to replace whois with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-whois-1.36.1-30.1.noarch.rpm"
RPM_HASH = "d0023b285754e8576a1e9749b79c4052f4ca7338372f704906248652b3d5dfb5f3080438d913caed7fc8edb0bbcef20130cc5e816ff3e3c6eb533ed02d9a6928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-whois"

RDEPENDS:${PN} += "busybox"

inherit rpm
