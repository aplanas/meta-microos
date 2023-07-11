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

RPM_NAME = "perl-PadWalker-2.5-1.16.aarch64.rpm"
RPM_HASH = "f0c17b25c7e039b14c37d63d54a882a3532a95a944de63915ddc7ec36f82b35ee2a6f4b8aed728d526e98b17ea0fdae34f3749ebfa6d3087b4643f71e2121f1e"

RPROVIDES:${PN} += "perl-PadWalker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
