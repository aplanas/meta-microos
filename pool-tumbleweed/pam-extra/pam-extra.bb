SUMMARY = "PAM module with extended dependencies"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains extra modules eg pam_issue and pam_timestamp which \
can have extended dependencies."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-extra-1.5.3-3.1.aarch64.rpm"
RPM_HASH = "590ab07594eab75de0dd472e22b72972340187069691b261b409e445d211fb57d9460b8bcbf08d03f5596b0cc7cb60064fef405d94cde0a58c54d3c2be3a41fd"

RPROVIDES:${PN} += "pam-/usr/sbin/pam-timestamp-check \
pam-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
