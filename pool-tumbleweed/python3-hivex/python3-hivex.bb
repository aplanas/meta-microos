SUMMARY = "Python bindings for libhivex"
DESCRIPTION = "This subpackage contains the Python bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "python3-hivex-1.3.23-2.6.aarch64.rpm"
RPM_HASH = "236c77602de2232a578647e017efd4ab673aff01f136c6fd1f2d1c0b399d982150d0b56020cafbce83aeab9b00dc94da72adec97883000586199376eb9953289"

RPROVIDES:${PN} += "libhivexmod.so \
python-hivex \
python3-hivex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
python-abi"

inherit rpm
