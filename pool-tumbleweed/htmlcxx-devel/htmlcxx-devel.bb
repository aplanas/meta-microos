SUMMARY = "Headers and Static Library for htmlcxx"
DESCRIPTION = "The htmlcxx-devel package contains libraries and header files for \
developing applications that use htmlcxx."
LICENSE = "LGPL-2.0-only & Apache-2.0"

PV = "0.87"

RPM_NAME = "htmlcxx-devel-0.87-2.9.aarch64.rpm"
RPM_HASH = "f52dac59f8d71a143fe4ca8f3dc3af6e28744a9b2c2c4c1ceb6460de279272113ed5a2efb6b1c8f0c6dcb47b48f80550e54a5be14a621ec1f9bc2a4e97d1404b"

RPROVIDES:${PN} += "htmlcxx-devel \
pkgconfig-htmlcxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
htmlcxx"

inherit rpm
