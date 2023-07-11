SUMMARY = "Libraries for foreign function call interfaces"
DESCRIPTION = "This is a collection of four libraries which can be used to build \
foreign function call interfaces in embedded interpreters.  The four \
packages are: \
 - avcall: calling C functions with variable arguments \
 - vacall: C functions accepting variable argument prototypes \
 - trampoline: closures as first-class C functions \
 - callback: closures with variable arguments as first-class C functions \
   (a reentrant combination of vacall and trampoline)"
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "ffcall-2.4-2.8.aarch64.rpm"
RPM_HASH = "c0544358e50eb106b0a16bbcb5dee9e2af012d975fda25673174185da8341244e55887a7df69e042d25086e5d9ea7702fdffd92eb1d1e5a302ecd3a228af0ca0"

RPROVIDES:${PN} += "ffcall \
ffcall-devel \
rpm-macro-ffcall-arches"

RDEPENDS:${PN} += "libavcall1 \
libcallback1 \
libffcall0 \
libtrampoline1"

inherit rpm
