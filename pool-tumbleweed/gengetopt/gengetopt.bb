SUMMARY = "Commandline parser generator"
DESCRIPTION = "Gengetopt is a tool to generate C code to parse getopt styled command line \
arguments. \
It's similar or even more powerful than the well known libpopt but does not \
add any run or compile time dependencies to your projects. Moreover \
reading/writing the options from/to config files is also supported."
LICENSE = "GPL-3.0-or-later"

PV = "2.23"

RPM_NAME = "gengetopt-2.23-1.14.aarch64.rpm"
RPM_HASH = "65b24350a55b28e77aacb105369558cc4a1c4e5dc9bfbba34db4f18a13e26cec435849b01fc53f212017aeb35656f905fc4d594ec568b34c8af39090713e4e5c"

RPROVIDES:${PN} += "gengetopt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
