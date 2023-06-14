SUMMARY = "Command line client for accessing the Czech Data Boxes"
DESCRIPTION = "This is Shigofumi, an ISDS (Informační systém datových schránek / Data Box \
Information System) client."
LICENSE = "GPL-3.0+"

PV = "0.9"

RPM_NAME = "shigofumi-0.9-1.7.aarch64.rpm"
RPM_HASH = "6c250b59fd9fccf4da5a77f4256fadbbdf7a8349443025931483c954358545434d98e8a9d4a939861c409d3036bc762c8f9acf49d54b0a30e920a9260784e7c9"

RPROVIDES:${PN} += "shigofumi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libisds.so.5 \
libmagic.so.1 \
libreadline.so.8 \
libxml2.so.2"

inherit rpm
