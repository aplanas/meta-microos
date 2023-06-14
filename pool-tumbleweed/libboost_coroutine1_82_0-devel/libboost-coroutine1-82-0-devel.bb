SUMMARY = "Development headers for Boost.Coroutine"
DESCRIPTION = "This package provides headers for Boost.Coroutine libraries. \
Boost.Coroutine2 provides templates for generalized subroutines which \
allow suspending and resuming execution at certain locations."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_coroutine1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "c870dfda60a7b79c9fb5a595c179d9b700858c3840d1d7fffd8973bd6dfbdf8226cdc08ae4ac140fc97c9f41393d92daa6396adaf53d12fec37b870bc2f7a4a4"

RPROVIDES:${PN} += "libboost-coroutine-devel-impl \
libboost-coroutine1-82-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-82-0-devel \
libboost-context1-82-0-devel \
libboost-coroutine1-82-0 \
libboost-headers1-82-0-devel \
libboost-thread1-82-0-devel \
libstdc++-devel"

inherit rpm
