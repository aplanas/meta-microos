SUMMARY = "Files for Developing with libcuckoo"
DESCRIPTION = "Libcuckoo is a high-performance, concurrent hash table. \
This package contains the libcuckoo development files."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "libcuckoo-devel-0.3.1-1.3.aarch64.rpm"
RPM_HASH = "8eaeb7e5e222e7a5a3a6665911be7e49f10d971cd955329e5dcbbe9e7c8bcf5b128927fef8fdd659b7e6fe6eca6827e5781e92bba6afa2d869f2119ae0608ec7"

RPROVIDES:${PN} += "cmake-libcuckoo \
libcuckoo-devel"

RDEPENDS:${PN} += ""

inherit rpm
