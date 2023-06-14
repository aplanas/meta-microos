SUMMARY = "CDIO plugin for the C* Music Player"
DESCRIPTION = "This package provides CDIO support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-cdio-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "4710ef1d72fc7e2cb16a6d3e9d5ea03630364bbb94de8deebe5bffec40db22359a8d0cb6f40fa8d37a548b14513767cd476f44c7b8233c1e2c3afb2a6642455f"

RPROVIDES:${PN} += "cmus-plugin-cdio"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcddb.so.2 \
libcdio-cdda.so.2 \
libcdio.so.19"

inherit rpm
