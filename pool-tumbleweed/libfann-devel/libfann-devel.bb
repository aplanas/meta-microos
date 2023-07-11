SUMMARY = "Development package for fann, an artificial neural network library"
DESCRIPTION = "FANN is a neural network library which implements multilayer \
artificial neural networks in C with support for both fully connected \
and sparsely connected networks. \
 \
This subpackage contains the headers for FANN."
LICENSE = "LGPL-2.1+"

PV = "2.2.0"

RPM_NAME = "libfann-devel-2.2.0-2.26.aarch64.rpm"
RPM_HASH = "154623216e02c48b4b9477c620c324e58b0e86c5a163a8e765ffb0e8ab60d4ceb7d3798745b6857ee5d267373b6db7df17b519ec3ec834adcada51de58157c95"

RPROVIDES:${PN} += "fann-devel \
libfann-devel \
pkgconfig-fann"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfann2 \
libstdc++-devel"

inherit rpm
