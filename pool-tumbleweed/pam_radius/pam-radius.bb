SUMMARY = "A PAM Module for User Authentication using a Radius Server"
DESCRIPTION = "This is the PAM to RADIUS authentication module. It allows any PAM-capable \
machine to become a RADIUS client for authentication and accounting \
requests. You will need a RADIUS server to perform the actual \
authentication."
LICENSE = "GPL-2.0+"

PV = "2.0.0"

RPM_NAME = "pam_radius-2.0.0-1.8.aarch64.rpm"
RPM_HASH = "2f2096b3807b3f40b9f808c73b404b505fd87cc3b5b06d9350e9ff49c330799a6844932a89c8d4da0c9eb40dec4547e59279d4a6a69d9748302f6ad89ba0e1ce"

RPROVIDES:${PN} += "config-pam-radius \
pam-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam"

inherit rpm
