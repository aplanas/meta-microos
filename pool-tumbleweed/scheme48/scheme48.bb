SUMMARY = "An implementation of Scheme written by Richard Kelsey and Jonathan Rees"
DESCRIPTION = "Scheme 48 is an implementation of the Scheme programming language as described \
in the Revised5 Report on the Algorithmic Language Scheme. It is based on a \
compiler and interpreter for a virtual Scheme machine. Scheme 48 tries to be \
faithful to the Revised5 Scheme Report, providing neither more nor less in \
the initial user environment."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-1.9.2-2.18.aarch64.rpm"
RPM_HASH = "6ff81b4986c8366f76d204ff54c973b5fee3787d187bffbe1bdaff700362c9b10ecbf6f206d18e137de92886bc187037c395184034861cfbfb27b71e185faa2b"

RPROVIDES:${PN} += "scheme48 \
scheme48(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
scheme48-vm"

inherit rpm
