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

RPM_NAME = "ffcall-2.4-2.7.aarch64.rpm"
RPM_HASH = "6814352954aa1f138e7c8cfd98cbd1cb3ada31ec86811a277a1b18136ab8688154bcefdeaeb27ddf60bd1bf81e45ff03e3e13b08c7cb2ecddbe7e6287378d3f8"

RPROVIDES:${PN} += "ffcall \
ffcall-devel \
rpm-macro-ffcall-arches"

RDEPENDS:${PN} += "libavcall1 \
libcallback1 \
libffcall0 \
libtrampoline1"

inherit rpm
