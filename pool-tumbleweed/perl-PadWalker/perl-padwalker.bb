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

RPM_NAME = "perl-PadWalker-2.5-1.15.aarch64.rpm"
RPM_HASH = "507c4ec0fe1415b2ea4b433836f31fed4b8715f5f99a1b2836992cbb9fff085540752f4ec3ae3d7328c15bc0f089abf7147c3d19d22a6212bc7ff8f05b511822"

RPROVIDES:${PN} += "perl(PadWalker) \
perl-PadWalker \
perl-PadWalker(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
