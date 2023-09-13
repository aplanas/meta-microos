SUMMARY = "Enable xrdp to generate sound with pipewire"
DESCRIPTION = "This module allows xrdp to generate sound on a pipewire-based system."
LICENSE = "MIT"

PV = "0~git19"

RPM_NAME = "pipewire-module-xrdp-0~git19-1.1.aarch64.rpm"
RPM_HASH = "3960cfdb56c71aed7a8efd7c4f04a4da0dfacf6f66aa7185adb5da8a135d86657a536d1d2f3ca122387dba6d87db227392abee9bb60625db956e56f64166c712"

RPROVIDES:${PN} += "config-pipewire-module-xrdp \
libpipewire-module-xrdp-pipewire.so \
pipewire-module-xrdp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
