SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-devel-1.13.0-2.1.aarch64.rpm"
RPM_HASH = "99c93a3498f0573fb3a86db99b62ff2c82343bbca15f8bd2338a2f211f22b0c0278e5b185d24349a7642a111c2cdf56196b4d228d1502757806f980a648b9c4a"

RPROVIDES:${PN} += "augeas-devel augeas-devel(aarch-64) pkgconfig(augeas)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libaugeas0 libfa1 pkgconfig(libxml-2.0)"

inherit rpm
