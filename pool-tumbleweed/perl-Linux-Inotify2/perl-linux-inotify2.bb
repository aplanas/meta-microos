SUMMARY = "Scalable directory/file change notification"
DESCRIPTION = "This module implements an interface to the Linux 2.6.13 and later Inotify \
file/directory change notification system. \
 \
It has a number of advantages over the Linux::Inotify module: \
 \
   - it is portable (Linux::Inotify only works on x86) \
   - the equivalent of fullname works correctly \
   - it is better documented \
   - it has callback-style interface, which is better suited for \
     integration. \
 \
As for the inotify API itself - it is a very tricky, and somewhat \
unreliable API. For a good overview of the challenges you might run into, \
see this LWN article: https://lwn.net/Articles/605128/."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "2.3"

RPM_NAME = "perl-Linux-Inotify2-2.3-1.10.aarch64.rpm"
RPM_HASH = "7e0ab63d15d04a2f25d574c5b7cb8cdbfa3396dcf2ac1f43d2d499cc09d7484bf0e8b1c73a824a6092a64c3f8d2c06e37c134d81894afe7a78e367b0b5bb1767"

RPROVIDES:${PN} += "perl-Linux--Inotify2 \
perl-Linux--Inotify2--Event \
perl-Linux--Inotify2--Watch \
perl-Linux-Inotify2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-common--sense"

inherit rpm
