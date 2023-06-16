SUMMARY = "Xfce Development Tools"
DESCRIPTION = "The Xfce development tools are a collection of tools and macros for \
Xfce developers and people that want to build unreleased development \
versions of Xfce."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.0"

RPM_NAME = "xfce4-dev-tools-4.16.0-1.11.aarch64.rpm"
RPM_HASH = "5ea5b184116392cdb5b0c9b5989c42b933ea79e147bc3934025bbb1c12222b6cec5790ff60618151ce5e36858561bcc82ad2136860d04e0fce94ff8370c790be"

RPROVIDES:${PN} += "xfce4-dev-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
autoconf \
automake \
intltool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtool \
make"

inherit rpm
