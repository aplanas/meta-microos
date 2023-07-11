SUMMARY = "AX.25 tools"
DESCRIPTION = "These are the support utilities required to make use of the internal \
AX.25, NET/ROM and Rose support in the linux kernel. The ax25tools are \
mostly configuration utilities, applications can be found in the \
package ax25apps."
LICENSE = "GPL-2.0-only"

PV = "0.0.10rc5"

RPM_NAME = "ax25-tools-0.0.10rc5-1.9.aarch64.rpm"
RPM_HASH = "8cb37dbe701f3195581ba5c38bafd1ba0d8de6da33139bc178049bbf818740b9a17c518169fbee6d4a97bf60216a24dc4edfdc605eaae9b5988897d5f0d69ad3"

RPROVIDES:${PN} += "ax25-tools \
config-ax25-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libax25.so.0 \
libc.so.6 \
libz.so.1"

inherit rpm
