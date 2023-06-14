SUMMARY = "YaST2 - Bootloader Configuration"
DESCRIPTION = "This package contains the YaST2 component for bootloader configuration."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-bootloader-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "73d643fd0cf1da4c30c99c77e29a48b831b1cbe3d2f174023191066800f12eba7563c78dbb214d902c199e3e229b2a2a6cf6f0d6bcb1deeec44215e56c2aa2e0"

RPROVIDES:${PN} += "yast2-bootloader"

RDEPENDS:${PN} += "/bin/bash \
/bin/sed \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
augeas-lenses \
fillup \
parted \
rubygem-ruby-3.2.0-cfa-grub2 \
yast2 \
yast2-core \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
