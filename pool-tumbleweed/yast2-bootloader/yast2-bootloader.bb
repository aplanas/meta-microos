SUMMARY = "YaST2 - Bootloader Configuration"
DESCRIPTION = "This package contains the YaST2 component for bootloader configuration."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.2"

RPM_NAME = "yast2-bootloader-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "64079f0e89bba7bdc11754a8a6d54149c5dff3aff9d233de3c0027341b459a9eb5aab3c858566211bf6ec3714350d25005900a2b1ca18a2fc64068f5558bdbdc"

RPROVIDES:${PN} += "yast2-bootloader"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sed \
/usr/bin/sh \
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
