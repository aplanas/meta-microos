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

RPM_NAME = "mandoc-1.14.6-3.3.aarch64.rpm"
RPM_HASH = "0020037229f6cb34dab2dc2bd72330f5898cf427df3433f23e4a5d255de15d7e24602651fd879e25b7af9f07a83328eb0e5ff8fa9df513afd8a969c7b76b3463"

RPROVIDES:${PN} += "man \
mandoc"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
mandoc-bin"

inherit rpm
