SUMMARY = "Command line client for accessing the Czech Data Boxes"
DESCRIPTION = "This is Shigofumi, an ISDS (Informační systém datových schránek / Data Box \
Information System) client."
LICENSE = "GPL-3.0+"

PV = "0.9"

RPM_NAME = "shigofumi-0.9-1.8.aarch64.rpm"
RPM_HASH = "b385300c051d9bb29f019fe9098f1b82f9349a63d571608e76707d86d247752f58f53b476547bea08eeef877c0bf2cf2262aff0aff9eec5ac73a67d9a6b5a142"

RPROVIDES:${PN} += "shigofumi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libisds.so.5 \
libmagic.so.1 \
libreadline.so.8 \
libxml2.so.2"

inherit rpm
