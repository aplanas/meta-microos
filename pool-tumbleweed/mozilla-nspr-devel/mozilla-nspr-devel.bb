SUMMARY = "Netscape Portable Runtime development files"
DESCRIPTION = "NSPR provides platform independence for non-GUI operating system \
facilities. These facilities include threads, thread synchronization, \
normal file and network I/O, interval timing and calendar time, basic \
memory management (malloc and free), and shared library linking."
LICENSE = "MPL-2.0"

PV = "4.35"

RPM_NAME = "mozilla-nspr-devel-4.35-1.3.aarch64.rpm"
RPM_HASH = "fa0017d9c795b5eea38b69b219fc073501aae636d529a57f8175134bbb4cabab1fbe43efca2c08acc3866a79a7b401859121d05204662b60ebc537b17eaabf61"

RPROVIDES:${PN} += "mozilla-nspr-devel \
pkgconfig-nspr"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
mozilla-nspr"

inherit rpm
