SUMMARY = "PAM module with extended dependencies"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains extra modules eg pam_issue and pam_timestamp which \
can have extended dependencies."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-extra-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "4e6ad846fdc5d5e47d332ecef5927e52cdfff18852a601fbd34914e59fcfb642857038e745a9864936e2ff60288b8dc7549f42862631cb2340eb3f62f11c932b"

RPROVIDES:${PN} += "pam-/usr/sbin/pam-timestamp-check \
pam-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
