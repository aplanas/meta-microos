SUMMARY = "Play with other peoples' lexical variables"
DESCRIPTION = "PadWalker is a module which allows you to inspect (and even change!) \
lexical variables in any subroutine which called you. It will only show \
those variables which are in scope at the point of the call. \
 \
PadWalker is particularly useful for debugging. It's even used by Perl's \
built-in debugger. (It can also be used for evil, of course.) \
 \
I wouldn't recommend using PadWalker directly in production code, but it's \
your call. Some of the modules that use PadWalker internally are certainly \
safe for and useful in production."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.5"

RPM_NAME = "perl-PadWalker-2.5-1.17.aarch64.rpm"
RPM_HASH = "35f2bf534387d28d16f71a6397d5c8fd93d54aaf5df3cb927bfc092fa616bda5b51d60e20d5a4484b8c0d0c5b731980825ad040a7dea85a6fef154ddc22a620d"

RPROVIDES:${PN} += "perl-PadWalker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
