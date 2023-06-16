SUMMARY = "Commandline parser generator"
DESCRIPTION = "Gengetopt is a tool to generate C code to parse getopt styled command line \
arguments. \
It's similar or even more powerful than the well known libpopt but does not \
add any run or compile time dependencies to your projects. Moreover \
reading/writing the options from/to config files is also supported."
LICENSE = "GPL-3.0-or-later"

PV = "2.23"

RPM_NAME = "gengetopt-2.23-1.13.aarch64.rpm"
RPM_HASH = "8efbcc671b378b39444592a6beb6ff9367977befa2a09461f1e8c781de7590339b9bc066d977e2222e7a623c48b228f36e4e5760c631c5933f6f3234af62ad31"

RPROVIDES:${PN} += "gengetopt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
