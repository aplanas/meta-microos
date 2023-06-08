SUMMARY = "Development files for antic"
DESCRIPTION = "Antic is an algebraic number theory library. \
 \
This subpackage contains the include files and library links for \
developing against the ANTIC library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "antic-devel-0.2.5-2.1.aarch64.rpm"
RPM_HASH = "314dc9dc56e7cf8be218f7d8ba98ac1f9e36e66c846b10adf795efdf5949126e0aca67e6884423c869d09617dbb06f21e7549152cfc02b34dbdd6d2c49a30fee"

RPROVIDES:${PN} += "antic-devel antic-devel(aarch-64)"
RDEPENDS:${PN} += "flint-devel gmp-devel libantic0"

inherit rpm
