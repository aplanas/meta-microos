SUMMARY = "Development files for ProFTPD"
DESCRIPTION = "This package contains Development files for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-devel-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "8f25097f019892becfa5a161da1df5377741b1679ae8bf9402b6aa0d5e87a58422c5ac5eddbbec9c6468c7d45ab56842855845bcc83d7d50d04222a2f7f0bf64"

RPROVIDES:${PN} += "pkgconfig(proftpd) \
proftpd-devel \
proftpd-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
proftpd"

inherit rpm
