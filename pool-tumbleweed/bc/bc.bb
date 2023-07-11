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

RPM_NAME = "bc-1.07.1-4.23.aarch64.rpm"
RPM_HASH = "a6b26e02af690eb593d1cbadf19cceaeb46056306de3a5a12719849e562fcb5743d399dfebacf4f2ca6202d1b4e2519b9e54df5654110623b9663b922d0866e7"

RPROVIDES:${PN} += "bc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
