SUMMARY = "A PAM Module for User Authentication using a Radius Server"
DESCRIPTION = "This is the PAM to RADIUS authentication module. It allows any PAM-capable \
machine to become a RADIUS client for authentication and accounting \
requests. You will need a RADIUS server to perform the actual \
authentication."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "pam_radius-2.0.0-2.1.aarch64.rpm"
RPM_HASH = "8b45ff1faa3ee1145156bae02e4e4132787521edf2f7e601981dd13aa94bfd334f68b410f6e43d31811e0a06c6b9a8182c38d705d5dc17f453b0ba7b30df3f2f"

RPROVIDES:${PN} += "config-pam-radius \
pam-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam"

inherit rpm
