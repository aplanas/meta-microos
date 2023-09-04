SUMMARY = "HTML output stream class, and some markup utilities"
DESCRIPTION = "The *HTML::Stream* module provides you with an object-oriented (and \
subclassable) way of outputting HTML. Basically, you open up an 'HTML \
stream' on an existing filehandle, and then do all of your output to the \
HTML stream. You can intermix HTML-stream-output and ordinary-print-output, \
if you like. \
 \
There's even a small built-in subclass, *HTML::Stream::Latin1*, which can \
handle Latin-1 input right out of the box. But all in good time..."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.60"

RPM_NAME = "perl-HTML-Stream-1.60-1.21.noarch.rpm"
RPM_HASH = "af073ac398ece5426c2bf317b27868bc96346b04b3a70b6b22459e73730906ce177c9308409a0dd579497de21942566377f367e0bff54b8b6ced74a54a5d9a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Stream \
perl-HTML--Stream--FileHandle \
perl-HTML--Stream--Latin1 \
perl-HTML-Stream"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
