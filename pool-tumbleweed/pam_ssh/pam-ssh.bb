SUMMARY = "PAM Module for SSH Authentication"
DESCRIPTION = "This module provides single sign-on behavior. The user types a \
passphrase when logging in and is allowed in if it decrypts the user s \
SSH private key. An ssh-agent is started and keys are added. For the \
entire session, the user types no more passwords."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "pam_ssh-2.3-4.6.aarch64.rpm"
RPM_HASH = "f5ad617e2279c9a5767d4bf4c0ef0e6c7dbdfc86d3e585eb5e0bde83a890c58d95cdfe3ba167bba1dd3bb7d460ffd69822522601f1cc11673621db17ebd03361"

RPROVIDES:${PN} += "pam-ssh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpam.so.0"

inherit rpm
