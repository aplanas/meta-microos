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

RPM_NAME = "imake-1.0.9-1.2.aarch64.rpm"
RPM_HASH = "b6c8c19eb11ade97e1c55c86b4abfb4401e0098f8ccf7b562fde1a2dc30c1a6346790a93cbc59088f081d1001adc7f54c55071e3b1520b1c5998da72bf0385b6"

RPROVIDES:${PN} += "imake \
imake(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
xorg-cf-files"

inherit rpm
