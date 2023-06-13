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

RPM_NAME = "perl-HTML-Stream-1.60-1.19.noarch.rpm"
RPM_HASH = "b6d0ff4849e63b03f7e08f438e096314358fcc09298414beebed63023067d134be3d7c1e0aec3b808090c00a763d29be26ebc9677724ce4c200062c8d5868322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::Stream) \
perl(HTML::Stream::FileHandle) \
perl(HTML::Stream::Latin1) \
perl-HTML-Stream"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
