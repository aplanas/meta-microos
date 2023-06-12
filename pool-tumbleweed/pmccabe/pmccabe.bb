SUMMARY = "McCabe-style complexity and line counting for C and C++"
DESCRIPTION = "Pmccabe calculates McCabe-style cyclomatic complexity for C and C++ \
source code.  Per-function complexity may be used for spotting likely \
trouble spots and for estimating testing effort. \
 \
Pmccabe also includes a non-commented line counter compatible with anac, \
'decomment' which only removes comments from source code; 'codechanges', \
a program to calculate the amount of change which has occurred between \
two source trees or files; and 'vifn', to invoke 'vi' given a function \
name rather than a file name. \
 \
Pmccabe attempts to calculate the apparent complexity rather \
than the complexity following the C++ and/or cpp preprocessors. \
This causes Pmccabe to become confused with cpp constructs which \
cause unmatched curly braces - most of which can profitably be \
rewritten so they won't confuse prettyprinters anyway.  Pmccabe prints \
C-compiler-style error messages when the parser gets confused so they \
may be browsed with standard tools. \
 \
Two types of cyclomatic complexity are generated - one type counts \
each switch() statement as regardless of the number of cases included and \
the other more traditional measure counts each case within the switch(). \
Pmccabe also calculates the starting line for each function, the number of \
lines consumed by the function, and the number of C statements within the \
function."
LICENSE = "GPL-2.0-or-later"

PV = "2.8"

RPM_NAME = "pmccabe-2.8-1.7.aarch64.rpm"
RPM_HASH = "2d9f34e0e33367510f66626441c904725ae382ed38379227182a9cb376f65cfbe81e9f9a33f3896ee7bd984e908175c04597389595aaa4278d5c9499ad4b27fd"

RPROVIDES:${PN} += "pmccabe \
pmccabe(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
