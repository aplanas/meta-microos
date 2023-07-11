SUMMARY = "SBLIM CMPI Provider Development Support"
DESCRIPTION = "This packages provides the C and C++ CMPI header files needed by \
provider developers and can be used standalone. If used for C++ \
provider development it is also necessary to have tog-pegasus-devel \
installed."
LICENSE = "EPL-1.0"

PV = "2.0.3"

RPM_NAME = "sblim-cmpi-devel-2.0.3-8.27.aarch64.rpm"
RPM_HASH = "ccc71db12837c84c93f4b778c88e98eec48939ea40d86c622b014b63a57189437357451cb92cf3923545d08a559cd0148510beb75cd11371108f0e485a47701c"

RPROVIDES:${PN} += "cmpi-devel \
sblim-cmpi-devel"

RDEPENDS:${PN} += ""

inherit rpm
