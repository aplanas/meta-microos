SUMMARY = "C preprocessor interface to the make utility"
DESCRIPTION = "Imake is used to generate Makefiles from a template, a set of cpp macro \
functions, and a per-directory input file called an Imakefile. \
 \
The X Window System used imake extensively up through the X11R6.9 \
release, for both full builds within the source tree and external \
software. X has since moved to GNU autoconf and automake for its build \
system in X11R7.0 and later releases, but still maintains imake for \
building existing external software programs that have not yet \
converted."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "imake-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "497ad0ad4abcde95a262e487dcccbc8a76fa1143687f04610782b01c5ca0474f77f33de3beba7e5405f2e67dbb15eef3c39063d822b2c1f329065208c93ce817"

RPROVIDES:${PN} += "imake"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
xorg-cf-files"

inherit rpm
