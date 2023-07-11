SUMMARY = "Development files for the libratbag game mouse config library"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the files needed to build programs with \
libratbag."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libratbag-devel-0.17-2.2.aarch64.rpm"
RPM_HASH = "06ff15ac710872dd3cc4b254e2357bb03be11774cc81099b182ea32bdd8b6c42faafc712df61a85501c164b3098058dae74045f4e47e68b47dc9f560cec1f4a8"

RPROVIDES:${PN} += "libratbag-devel \
pkgconfig-liblur"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblur3"

inherit rpm
