SUMMARY = "SBLIM CMPI Provider Development Support"
DESCRIPTION = "This packages provides the C and C++ CMPI header files needed by \
provider developers and can be used standalone. If used for C++ \
provider development it is also necessary to have tog-pegasus-devel \
installed."
LICENSE = "EPL-1.0"

PV = "2.0.3"

RPM_NAME = "sblim-cmpi-c++-devel-2.0.3-8.26.aarch64.rpm"
RPM_HASH = "3b9b99b469135e913521fad71c2024ee3af54874a5e17621fa3acb16b548367a7222be526bf8bef53cd96fa418d6a7dc2166dc2ea29c4b82e468b7b3e1200b42"

RPROVIDES:${PN} += "sblim-cmpi-c++-devel \
sblim-cmpi-c++-devel(aarch-64)"

RDEPENDS:${PN} += "libcmpiCppImpl0 \
sblim-cmpi-devel"

inherit rpm
