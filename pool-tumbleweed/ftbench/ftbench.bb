SUMMARY = "Run FreeType benchmarks"
DESCRIPTION = "Run FreeType benchmarks \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftbench-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "9d238c45426435f0ec9741fd1f60ef1977b289dabd98597cf7898bc06eaabc5d10abecf880dcc256b4fd459c0357f10a649b6d19d94fa4aae40dceb832cfc653"

RPROVIDES:${PN} += "ftbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
