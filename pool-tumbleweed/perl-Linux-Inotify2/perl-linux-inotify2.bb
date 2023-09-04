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

RPM_NAME = "perl-Linux-Inotify2-2.3-1.12.aarch64.rpm"
RPM_HASH = "ba27d6f689204192481a6f973c43cc4d7c14b26afc7f3777196d444ee297aac7a5826914695be7bbb226d3303b9c7db6ae2246a95c15035ba468b35d2bf02629"

RPROVIDES:${PN} += "perl-Linux--Inotify2 \
perl-Linux--Inotify2--Event \
perl-Linux--Inotify2--Watch \
perl-Linux-Inotify2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-common--sense"

inherit rpm
