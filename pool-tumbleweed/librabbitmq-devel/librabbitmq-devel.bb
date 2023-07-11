SUMMARY = "Header files and development libraries for rabbitmq-c"
DESCRIPTION = "This package contains the header files and development libraries \
for rabbitmq-c."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "librabbitmq-devel-0.13.0-2.1.aarch64.rpm"
RPM_HASH = "4b6b62facdff4bbdee9b9f00ee0c866506845b8c0e5f866bb206c8c3e15fef96ec0797dccc053f9476ca4eb132bbcb5d8246c4f543484a186952bbcf724b6e24"

RPROVIDES:${PN} += "cmake-rabbitmq-c \
librabbitmq-devel \
pkgconfig-librabbitmq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librabbitmq4"

inherit rpm
