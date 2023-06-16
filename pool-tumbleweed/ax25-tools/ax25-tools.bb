SUMMARY = "AX.25 tools"
DESCRIPTION = "These are the support utilities required to make use of the internal \
AX.25, NET/ROM and Rose support in the linux kernel. The ax25tools are \
mostly configuration utilities, applications can be found in the \
package ax25apps."
LICENSE = "GPL-2.0-only"

PV = "0.0.10rc5"

RPM_NAME = "ax25-tools-0.0.10rc5-1.8.aarch64.rpm"
RPM_HASH = "f179c53b1b1abe64f7cff15bdd5f3436946da4e4d1a4df9d4f234b6507a31ec2fc08028fd50a90d55d4174fb162b4dd67407303abdcc967d715159bc8aba95f5"

RPROVIDES:${PN} += "ax25-tools \
config-ax25-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libax25.so.0 \
libc.so.6 \
libz.so.1"

inherit rpm
