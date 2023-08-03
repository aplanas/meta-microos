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

RPM_NAME = "libbde1-20221031-4.1.aarch64.rpm"
RPM_HASH = "f8f8e696eefd5a1507a4bcd2da46ac789bbe242a8cc591a9a084f491db350176d63daa775e408fa2add8da2419097b0289ec3c0cfff938ea60259bef29fdb80a"

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
