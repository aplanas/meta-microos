SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-ppc64-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "e4120c193f2d77d5f9c0db3ef9288fc231ec2d835c14038ea970830beda5ff11b082cd53b7d996ef0c8356dec0f9f9a6ec816bcccfbeff83399dd8136d0c06d7"

RPROVIDES:${PN} += "cross-ppc64-gcc11 cross-ppc64-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-ppc64-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
