SUMMARY = "Allows Ruby scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Ruby (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-ruby-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "89864ad34efe9fb1fe981a8f38e395189c6783e999000c777c5bab8c08b5354430fe9f38696df4b38fe00862114d97cd969ea239ff90ab85f37443f44415481c"

RPROVIDES:${PN} += "libsvn_swig_ruby-1.so.0()(64bit) \
subversion-ruby \
subversion-ruby(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libapr-1.so.0()(64bit) \
libc.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libsvn_client-1.so.0()(64bit) \
libsvn_delta-1.so.0()(64bit) \
libsvn_diff-1.so.0()(64bit) \
libsvn_fs-1.so.0()(64bit) \
libsvn_ra-1.so.0()(64bit) \
libsvn_repos-1.so.0()(64bit) \
libsvn_subr-1.so.0()(64bit) \
libsvn_wc-1.so.0()(64bit) \
subversion"

inherit rpm
