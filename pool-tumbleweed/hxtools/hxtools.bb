SUMMARY = "Collection of day-to-day tools (binaries)"
DESCRIPTION = "A collection of various tools. Some of the important ones: \
 \
* checkbrack(1) — check parenthesis and bracket count \
* fd0ssh(1) — pipe for password-over-stdin support to ssh \
* ofl(1) — open file lister (replaces fuser and lsof -m) \
* tailhex(1) — hex dumper with tail-following support"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-20230411-1.2.aarch64.rpm"
RPM_HASH = "d047b6e9119558d152aba25a5dd2ec39c361c44c69ff9d3fb43afa9d563e52baa70c45abef06821838c2f5edb2b3abfcf6ad44c607cda01a86c2fb94f94c980a"

RPROVIDES:${PN} += "hxtools"

RDEPENDS:${PN} += "/usr/bin/sh \
fd0ssh \
hxtools-scripts \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ofl \
sysinfo"

inherit rpm
