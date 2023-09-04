SUMMARY = "UNIX manpage compiler"
DESCRIPTION = "The mandoc manpage compiler toolset (formerly called 'mdocml') \
is a suite of tools compiling mdoc(7), the roff(7) macro language \
of choice for BSD manual pages, and man(7), the predominant \
historical language for UNIX manuals. \
 \
It includes a man(1) manual viewer and additional tools. \
For general information, see <http://mandoc.bsd.lv/>."
LICENSE = "ISC"

PV = "1.14.6"

RPM_NAME = "mandoc-1.14.6-5.1.aarch64.rpm"
RPM_HASH = "d973234b1effd2d37e78e82926af8f9f0a72d462fb717a45f9d0257b1c20ef122c996e514379b47d64397b0aabe6791d8fe290c71e90f1b3cc221d9b0e45e9bf"

RPROVIDES:${PN} += "man \
mandoc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
mandoc-bin"

inherit rpm
