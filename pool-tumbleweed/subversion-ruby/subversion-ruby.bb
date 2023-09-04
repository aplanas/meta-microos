SUMMARY = "Allows Ruby scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Ruby (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-ruby-1.14.2-6.2.aarch64.rpm"
RPM_HASH = "eb60092cd94be4c0cc7503d5c96f5eb9b960ba253371790682ac023863fa44727b0b64124a0c04d6555f93811fa740e8b2323ffe7dfa8fe7ab469f0bac086989"

RPROVIDES:${PN} += "libsvn-swig-ruby-1.so.0 \
subversion-ruby"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libruby3.2.so.3.2 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
subversion"

inherit rpm
