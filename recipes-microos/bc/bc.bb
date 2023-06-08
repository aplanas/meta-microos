SUMMARY = "GNU Command Line Calculator"
DESCRIPTION = "bc is an interpreter that supports numbers of arbitrary precision and \
the interactive execution of statements. The syntax has some \
similarities to the C programming language. A standard math library is \
available through command line options. When used, the math library is \
read in before any other input files. bc then reads in all other files \
from the command line, evaluating their contents. Then bc reads from \
standard input (usually the keyboard). \
 \
The dc program is also included. dc is a calculator that supports \
reverse-polish notation and allows unlimited precision arithmetic. \
Macros can also be defined. Normally, dc reads from standard input but \
can also read in files specified on the command line. A calculator with \
reverse-polish notation saves numbers to a stack. Arguments to \
mathematical operations (operands) are 'pushed' onto the stack until \
the next operator is read in, which 'pops' its arguments off the stack \
and 'pushes' its results back onto the stack."
LICENSE = "GPL-2.0-or-later"

PV = "1.07.1"

RPM_NAME = "bc-1.07.1-4.22.aarch64.rpm"
RPM_HASH = "d1927b719a4a9b14cece5d3b77737847fac886e8c307a1dc0c79e6c4ddb862cf1ab95c645e9fd661bbd5d6fefbc81fabf4043bf8ffcd50d4e647f6b2f5aac015"

RPROVIDES:${PN} += "bc bc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libreadline.so.8()(64bit)"

inherit rpm
