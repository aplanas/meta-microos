SUMMARY = "Library to access Microsoft Bitlocker Drive Encrypted volumes"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume. \
 \
Supported BDE formats: \
 \
* BitLocker Windows Vista \
* BitLocker Windows 7 \
* BitLocker Windows 8 (Consumer Preview) \
* BitLocker To Go \
 \
Supported protection methods: \
 \
* clear key \
* password \
* recovery password \
* start-up key \
* FKEV and/or TWEAK key data \
 \
Additional features: \
 \
* support for partial encrypted volumes \
* zeros out the BDE metadata, matches behavior seen on Windows"
LICENSE = "LGPL-3.0-or-later"

PV = "20221031"

RPM_NAME = "libbde1-20221031-3.9.aarch64.rpm"
RPM_HASH = "454bb129fabdc1c1969aa359b9e56ce8573f0230e709f56f9e1616fd5ac83efc7c0a454f4057e4d70184aa6ea994882b96d677eff6e093b1e04d70345dea8b8b"

RPROVIDES:${PN} += "libbde.so.1 \
libbde1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfvalue.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
