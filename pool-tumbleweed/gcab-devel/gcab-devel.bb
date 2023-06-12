SUMMARY = "Development files for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides development files to build code against \
libgcab."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "gcab-devel-1.5-1.5.aarch64.rpm"
RPM_HASH = "043f01b9ec5b407991e08980feb2f04e771863dc85c375665bc18ebd40f670c68ed011b8a6738cedf48d0e65f0b3b79ab2ff150add2c240e056e6850173f27c4"

RPROVIDES:${PN} += "gcab-devel \
gcab-devel(aarch-64) \
pkgconfig(libgcab-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcab-1_0-0 \
pkgconfig(gio-2.0)"

inherit rpm
