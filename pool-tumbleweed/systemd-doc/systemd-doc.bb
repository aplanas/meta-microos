SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "systemd-doc-253.5-5.1.aarch64.rpm"
RPM_HASH = "f0ca3dc778241edcf6f11369865068a37fc22dacf41312aabf0785dd440e159638ee9ae8962899c9705e84c277cab8cf8da8be3211166c16c061e91d91e41fa1"

RPROVIDES:${PN} += "systemd-doc"

RDEPENDS:${PN} += ""

inherit rpm
