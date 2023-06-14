SUMMARY = "Allows Ruby scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Ruby (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-ruby-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "89864ad34efe9fb1fe981a8f38e395189c6783e999000c777c5bab8c08b5354430fe9f38696df4b38fe00862114d97cd969ea239ff90ab85f37443f44415481c"

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
