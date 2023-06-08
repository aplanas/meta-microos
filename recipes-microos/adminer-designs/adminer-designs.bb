SUMMARY = "Alternative designs"
DESCRIPTION = "Alternative designs for Adminer. Update the symbolic link at \
/usr/share/adminer/adminer.css to target the desired theme found in \
/usr/share/adminer/designs/*/adminer.css."
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-designs-4.8.1-1.6.noarch.rpm"
RPM_HASH = "a6c1e538030519db03f34f8d7fab3fbc2d03ef3e81cf36f1276556c9593762dcb0b8259eab0f571fed633c3bb1891469d38c852845924c525231e5c595854bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-designs"
RDEPENDS:${PN} += "adminer"

inherit rpm
