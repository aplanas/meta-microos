SUMMARY = "Development files for erfa"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use erfa."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "erfa-devel-2.0.0-1.10.aarch64.rpm"
RPM_HASH = "71f474ebe3233a9c4b086edb44073bc18b93b81cd148e1de4e97d8f74383237b165aee2911b00328d04654afd8b7260989e5bab5be97930641bb8e7f8f30269a"

RPROVIDES:${PN} += "erfa-devel \
erfa-devel(aarch-64) \
pkgconfig(erfa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liberfa1"

inherit rpm
