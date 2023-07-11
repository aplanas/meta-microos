SUMMARY = "Development files for the hhdate library"
DESCRIPTION = "A date and time library based on the C++11/14/17 chrono header."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "hhdate-devel-3.0.1-3.4.aarch64.rpm"
RPM_HASH = "28e973d83040292741351c38ddc79723e309db7b8f632c59ba68e4baf71033946378198d97c2608691a7b7f36559b9df21fa052767cc6c6417e89d13b8dae342"

RPROVIDES:${PN} += "cmake-date \
hhdate-devel"

RDEPENDS:${PN} += "libdate-tz3"

inherit rpm
