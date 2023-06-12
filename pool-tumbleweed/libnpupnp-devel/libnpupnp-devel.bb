SUMMARY = "Development files for libnpupnp"
DESCRIPTION = "The libnpupnp-devel package contains libraries and header files for \
developing applications that use libnpupnp."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "libnpupnp-devel-5.0.0-1.4.aarch64.rpm"
RPM_HASH = "d2a0965adcb373705af9515d9f968760afee9666d0b8b5e6ebe96cea0a861acdda64766f758d1639df1dc0d9667c04b5282d4b90b3baa562dfab9ea067f40a7e"

RPROVIDES:${PN} += "libnpupnp-devel \
libnpupnp-devel(aarch-64) \
pkgconfig(libnpupnp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnpupnp9"

inherit rpm
