SUMMARY = "Core git tools"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
These are the core tools with minimal dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-core-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "cf16e13f78f1040a778483ef1c5dd70586efe098967326206cb82a6cb84b88988d0ffd1b2d0c15fa8a5d11f59673bfd9f492767773f24055033960651c64e79b"

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
