SUMMARY = "Allows Ruby scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Ruby (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-ruby-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "5f2dac2511eaa2f365e193e71dfd9a1bd8e9ce144424f0fd8129e83fbc448e90a5aa6c3b85f30b8bf8af4d6a39e143af8c8f80afacde01e55d0628e3b0092719"

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
