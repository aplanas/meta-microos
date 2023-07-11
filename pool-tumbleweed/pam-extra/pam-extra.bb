SUMMARY = "PAM module with extended dependencies"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains extra modules eg pam_issue and pam_timestamp which \
can have extended dependencies."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-extra-1.5.3-1.2.aarch64.rpm"
RPM_HASH = "d9e94cb5c7677d7881efe0141d9e661fd53cd53b0d4cd04cb7e4d639a7c56fa5db57c60518851efbbead8b4a504877d0ceed677dffe3ccac5352ddcce2e28f91"

RPROVIDES:${PN} += "pam-/usr/sbin/pam-timestamp-check \
pam-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
