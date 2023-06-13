SUMMARY = "Development headers for the M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
This package allows you to write programs against libmbus."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus-devel-0.9.0+59-1.3.aarch64.rpm"
RPM_HASH = "fc5843d272b6ac8574382aa1234935b525a3ec520703cfa05db1a9ea1f852aaa3a2de95854f9093afb06f65d80ad2320fabf20a50f63b4da4a2d4f437c56ddca"

RPROVIDES:${PN} += "libmbus-devel \
libmbus-devel(aarch-64) \
pkgconfig(libmbus)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmbus0"

inherit rpm
