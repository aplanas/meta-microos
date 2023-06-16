SUMMARY = "YaST2 - Hardware Tuning"
DESCRIPTION = "This package contains the YaST2 component for hardware configuration."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-tune-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "d238e2018069c1c4018d7c74433f065f99663c3103a9bdef1eb032f1593a343f38cf9b0a341af51be5a26fbc1e5ff216677f6c9d85d34eeca37d5e9df154a8c0"

RPROVIDES:${PN} += "yast2-tune"

RDEPENDS:${PN} += "/usr/bin/sh \
yast2 \
yast2-bootloader \
yast2-ruby-bindings"

inherit rpm
