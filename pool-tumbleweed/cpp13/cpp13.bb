SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cpp13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "926ce394b5f74f0ed34b7cd64691372d033dc534cddb12dbbade198605a5d6b91d65e91a57fbe960b3919e72d52ab15fd365dba5801bc385897fa379a6714938"

RPROVIDES:${PN} += "cpp13"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
