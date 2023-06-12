SUMMARY = "Simple CSV file parser for the UNIX command line"
DESCRIPTION = "csvprintf is a simple UNIX command line utility for parsing CSV files. \
 \
csvprintf works like the printf(1) command line utility: you supply a \
printf(1) format string on the command line, and each row of the CSV file \
is split into arguments and formatted accordingly. The format specifiers \
in the format string contain numeric or symbolic column accessors to \
specify which CSV column to format. \
 \
csvprintf can also convert CSV files into XML and JSON documents \
and Bash variable assignments suitable for eval(1)."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "csvprintf-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "99f37e4c6f2eee831b5f03e6a859fd0066b5d32aaba7800aea1e8806653ec77cf9ef5416a2f93e0f8d64bafabf9c45faaa2118998f761cf380d9d14b6c77c156"

RPROVIDES:${PN} += "csvprintf \
csvprintf(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
xsltproc"

inherit rpm
