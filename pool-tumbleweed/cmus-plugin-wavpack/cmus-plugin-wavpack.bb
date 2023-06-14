SUMMARY = "WavPack input plugin for the C* Music Player"
DESCRIPTION = "This package provides WavPack input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-wavpack-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "7df9b80f5654be24502c119f8534c8b3108c11de43ce8af59e66cacbc8b89e7f02e2e5f29555894edce724e98bffef4918f78b55195d7cc3fa1c010dc5d8b6d5"

RPROVIDES:${PN} += "cmus-plugin-wavpack"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwavpack.so.1"

inherit rpm
