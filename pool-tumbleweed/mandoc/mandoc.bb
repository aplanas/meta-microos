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

RPM_NAME = "mandoc-1.14.6-4.1.aarch64.rpm"
RPM_HASH = "83cb8a983fac204dfb5cdb52f3d450220379e16d6e48a29544ad4a8420b8bcbebc72c9e6a209c69d2b2a40d81cf9f7754580cd43b879c3d5f8b11dd2f3f1eb19"

RPROVIDES:${PN} += "man \
mandoc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
mandoc-bin"

inherit rpm
