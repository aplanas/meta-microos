SUMMARY = "Boost.System runtime library"
DESCRIPTION = "This package contains the Boost.System stub library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_system1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "f8b9e09eb21ae4934f98ade7b68d168f5830209efface1ebe4012fe1eae5164667a44fc13b6b817a77b74d94ce63067a682a6626fccd8adfa0df6645f121ff6c"

RPROVIDES:${PN} += "libboost_system.so.1.82.0()(64bit) \
libboost_system1_82_0 \
libboost_system1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0"

inherit rpm
