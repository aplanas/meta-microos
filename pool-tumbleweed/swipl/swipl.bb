SUMMARY = "Prolog Compiler"
DESCRIPTION = "Edinburgh-style Prolog compiler including modules, autoload, libraries, \
Garbage collector, stack expandor, C interface, GNU readline and GNU \
Emacs interface, a very fast compiler,and an X11 interface using XPCE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9.0.4"

RPM_NAME = "swipl-9.0.4-2.1.aarch64.rpm"
RPM_HASH = "a07d5cab55a5bf7d1079987bd5cec47f7b045cd15d74c8d39fcc874dc38e41125aa92fd5ac4c4476f7bfa597cd4bf183a5e84903b6036e74dc758659492a855e"

RPROVIDES:${PN} += "cmake-SWIPL \
libedit4pl.so \
libjpl.so \
libswipl.so.9 \
pkgconfig-swipl \
swi-pl \
swi-prolog \
swipl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXpm.so.4 \
libXt.so.6 \
libarchive.so.13 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libdb-4.8.so \
libedit.so.0 \
libfontconfig.so.1 \
libgmp.so.10 \
libjpeg.so.8 \
libjvm.so \
libm.so.6 \
libodbc.so.2 \
libossp-uuid.so.16 \
libreadline.so.8 \
libssl.so.3 \
libtinfo.so.6 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm
