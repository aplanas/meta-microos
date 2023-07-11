SUMMARY = "SBLIM CMPI Provider Development Support"
DESCRIPTION = "This packages provides the C and C++ CMPI header files needed by \
provider developers and can be used standalone. If used for C++ \
provider development it is also necessary to have tog-pegasus-devel \
installed."
LICENSE = "EPL-1.0"

PV = "2.0.3"

RPM_NAME = "sblim-cmpi-c++-devel-2.0.3-8.27.aarch64.rpm"
RPM_HASH = "b9284acb04ba28d60579124f90e550c95b262df4cc5936bd8dbb59d2716189b932d28ffa3c28181b8ec7cf75013ce972f5cc673c1b81b21071fafb053fbd4d85"

RPROVIDES:${PN} += "sblim-cmpi-c++-devel"

RDEPENDS:${PN} += "libcmpiCppImpl0 \
sblim-cmpi-devel"

inherit rpm
