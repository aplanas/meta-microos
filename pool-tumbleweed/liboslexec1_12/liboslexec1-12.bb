SUMMARY = "OpenShadingLanguage's execution component library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "liboslexec1_12-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "a525099c897b383d842d2e0ffc4a211689743d0c21010df71d201a4e0a24ade158104dc34a2fda4ef9ee383767a45b69c8f5bb2285e3ce827db4de4c228213ff"

RPROVIDES:${PN} += "liboslexec.so.1.12()(64bit) \
liboslexec1_12 \
liboslexec1_12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libOpenImageIO.so.2.4()(64bit) \
libOpenImageIO_Util.so.2.4()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.15()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
liboslnoise.so.1.12()(64bit) \
liboslquery.so.1.12()(64bit) \
libpartio.so.1()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
