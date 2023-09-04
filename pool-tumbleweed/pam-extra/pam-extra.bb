SUMMARY = "PAM module with extended dependencies"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains extra modules eg pam_issue and pam_timestamp which \
can have extended dependencies."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-extra-1.5.3-2.1.aarch64.rpm"
RPM_HASH = "6714f2a026016138b8f9d86a184274fb25f43baf8511241e579ce81d70e52e84d838c3897b459c067ec0ca4232f4d97efdd6d29ae7f4abf619f11e0a496a4447"

RPROVIDES:${PN} += "pam-/usr/sbin/pam-timestamp-check \
pam-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
