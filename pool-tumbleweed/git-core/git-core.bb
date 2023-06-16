SUMMARY = "Core git tools"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
These are the core tools with minimal dependencies."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-core-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "43e9e34eb552f83317a6e16ad5c3bf64bfb9e55f799e20ef6524d187fe740dcd67f9dee72593f00df44e74bc1b60eed26302ed748fdc795c61c607bfe7b4caf8"

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
