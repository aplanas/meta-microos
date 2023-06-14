SUMMARY = "Development files for libmodplug"
DESCRIPTION = "Files needed to program against libmodplug."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.9.0+git20170610.f6dd59a"

RPM_NAME = "libmodplug-devel-0.8.9.0+git20170610.f6dd59a-2.8.aarch64.rpm"
RPM_HASH = "93bbdde80c12ed343e5a193f2191065961b87d6b70a59bcae6b8811fa123f58dc0736f28b700adf47837898d728735e14f9f112d3e608fccb2a68d621cd16d32"

RPROVIDES:${PN} += "libmodplug-devel \
pkgconfig-libmodplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodplug1"

inherit rpm
