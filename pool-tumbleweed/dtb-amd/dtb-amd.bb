SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-amd-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "73596b0556684cc7b720e80b286c8495304f98b7aee4f04d0a0d094b85d8496b1e826c9ad19f4b854492353fb1f45f7cf70698fd477adf429d3c7d594bb6cb50"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
