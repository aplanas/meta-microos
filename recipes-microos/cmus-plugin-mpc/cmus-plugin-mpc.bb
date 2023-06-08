SUMMARY = "MPC (Musepack) input plugin for the C* Music Player"
DESCRIPTION = "This package provides MPC (Musepack) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-mpc-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "d9def2adf739cc0e6c73ecebe4150b6950b6146e22a73767e174a71c1887f14d1649d86a116e9c02dc4841339f4ce2c78855102e5fa2ce3ec98f71ef9dca9fbb"

RPROVIDES:${PN} += "cmus-plugin-mpc cmus-plugin-mpc(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmpcdec.so.5()(64bit)"

inherit rpm
