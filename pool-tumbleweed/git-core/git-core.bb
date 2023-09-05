SUMMARY = "Core git tools"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
These are the core tools with minimal dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-core-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "36aef593f38479b2d5baf2f8f4b9736bddd344af5863cd54f87c405d407ae806553aa258468f4949d74e7e627cecf17565bb5e02c0a63f43dfe963839c529151"

RPROVIDES:${PN} += "git-core"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
less \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libpcre2-8.so.0 \
libsha1detectcoll.so.1 \
libssl.so.3 \
libz.so.1 \
openssh-clients"

inherit rpm
