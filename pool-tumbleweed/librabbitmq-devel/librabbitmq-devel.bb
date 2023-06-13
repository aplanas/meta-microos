SUMMARY = "Header files and development libraries for rabbitmq-c"
DESCRIPTION = "This package contains the header files and development libraries \
for rabbitmq-c."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "librabbitmq-devel-0.11.0-3.7.aarch64.rpm"
RPM_HASH = "aa93315a92e288240d88a0e7175a495427fe2c431695138d1fd889a0ef01a575a10245eabfae89635c2bc58124b423a1575210c1f5a29777b17a0fa39338cf1b"

RPROVIDES:${PN} += "cmake(rabbitmq-c) \
librabbitmq-devel \
librabbitmq-devel(aarch-64) \
pkgconfig(librabbitmq)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librabbitmq4 \
pkgconfig(openssl)"

inherit rpm
