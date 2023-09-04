SUMMARY = "Core git tools"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
These are the core tools with minimal dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-core-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "054503d25e790a5b33cfc8554d3c260489579981e6e5c4784d2348e87377b3fbb5f81691ecad5b62aa1b3adaac420ab149cad8382f433ad2fb613dbb90e7b5f7"

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
