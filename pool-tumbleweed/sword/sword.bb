SUMMARY = "Framework for manipulating Bible texts"
DESCRIPTION = "The SWORD Project is an effort to create an ever expanding software package for \
research and study of God and His Word. \
 \
The SWORD Bible Framework allows easy manipulation of Bible texts, commentaries, \
lexicons, dictionaries, etc.  Many frontends are build using this framework. \
An installed module set may be shared between any frontend using the framework."
LICENSE = "GPL-2.0-only & Apache-2.0"

PV = "1.8.1"

RPM_NAME = "sword-1.8.1-1.33.aarch64.rpm"
RPM_HASH = "14d1ae0627c8e8df57f282008b741ed0547b2ab48d7f25c528c818ef9e2bfed12f9270efa1dfa0e60fe29d759385c21e3583730c025779a29e36aa39c809ae5e"

RPROVIDES:${PN} += "config-sword \
sword"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libstdc++.so.6 \
libsword-1.8.1.so"

inherit rpm
