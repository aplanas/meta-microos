SUMMARY = "Python API for configuring sssd"
DESCRIPTION = "Provide python module to access and manage configuration of the System \
Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "python3-sssd-config-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "7ab46f4818b002c31c7e19b7a3a13fb38b2b8788aa5e40bc7cdafcf65756f077a2c3c8e18671514772583b64732bf76ef6f9986683cf5ab3609a25d9d0c76930"

RPROVIDES:${PN} += "python3-sssd-config \
python3.11dist-sssdconfig \
python3dist-sssdconfig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libpopt.so.0 \
libsss-crypt.so \
libsss-debug.so \
libsss-util.so \
libtalloc.so.2 \
python-abi \
python3"

inherit rpm
