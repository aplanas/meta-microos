SUMMARY = "Python API for configuring sssd"
DESCRIPTION = "Provide python module to access and manage configuration of the System \
Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "python3-sssd-config-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "73bd5aa6273cc3c7480a088c388316d7730df1cc3dc9ec32af7c508bc258b5c7387c81a1032308831a21db8f8cd1e0ad96bb64385b2b3c4cdfa6ab71924d9255"

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
