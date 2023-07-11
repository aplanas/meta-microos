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

RPM_NAME = "perl-HTML-Stream-1.60-1.20.noarch.rpm"
RPM_HASH = "1a9f0c6aa4ff361386424990d6c9fed18892f61ad9607d2bcc0bd0bf80c3c1b2ca04714939ed4f67c7ac65d92cae1ea4c9d2565d0767ea4818e76c55302447f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Stream \
perl-HTML--Stream--FileHandle \
perl-HTML--Stream--Latin1 \
perl-HTML-Stream"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
