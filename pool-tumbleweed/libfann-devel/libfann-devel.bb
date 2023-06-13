SUMMARY = "Development package for fann, an artificial neural network library"
DESCRIPTION = "FANN is a neural network library which implements multilayer \
artificial neural networks in C with support for both fully connected \
and sparsely connected networks. \
 \
This subpackage contains the headers for FANN."
LICENSE = "LGPL-2.1+"

PV = "2.2.0"

RPM_NAME = "libfann-devel-2.2.0-2.25.aarch64.rpm"
RPM_HASH = "2842a06c2fc5e0f0432c78901fab56b8225ff9920baa65242a8e72ff9dee9c827e9f2c770b2d791914ddbe406375ad0cd96f1bce98f58074a5ec065a6a258a3a"

RPROVIDES:${PN} += "fann-devel \
libfann-devel \
libfann-devel(aarch-64) \
pkgconfig(fann)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfann2 \
libstdc++-devel"

inherit rpm
