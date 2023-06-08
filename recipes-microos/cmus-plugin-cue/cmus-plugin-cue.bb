SUMMARY = "CUE input plugin for the C* Music Player"
DESCRIPTION = "This package provides CUE sheet support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-cue-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "9a885ec21f96900fda05be2fdf0fae562b711eb9a980a6782c7b241709714da8f5a16bd7ceffe8eb76b64959ca5c76a26d2b35ffc1eb21af523065c71db225bd"

RPROVIDES:${PN} += "cmus-plugin-cue cmus-plugin-cue(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
