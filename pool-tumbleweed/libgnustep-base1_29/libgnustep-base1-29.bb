SUMMARY = "GNUstep Base library package"
DESCRIPTION = "The GNUstep Base Library is a library of general-purpose, \
non-graphical Objective C classes, inspired by the \
OpenStep API but implementing Apple and GNU additions to the API \
as well.  It includes, for example, classes for Unicode strings, \
arrays, dictionaries, sets, byte streams, typed coders, invocations, \
notifications, notification dispatchers, scanners, tasks, files, \
networking, threading, remote object messaging support (distributed \
objects), event loops, loadable bundles, attributed Unicode strings, \
XML, MIME, user defaults."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.29.0"

RPM_NAME = "libgnustep-base1_29-1.29.0-1.5.aarch64.rpm"
RPM_HASH = "f9a79a860c44f0a08270f2337f297bee45325ede4cc3b791f2d9f48ff660ae3599142e8af2060a7314fa4ade21d147cb39456faa0b895864c043dbc826a16a3c"

RPROVIDES:${PN} += "libgnustep-base.so.1.29 \
libgnustep-base1-29"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libffi.so.8 \
libgcc-s.so.1 \
libgnutls.so.30 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libobjc.so.4 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1"

inherit rpm
