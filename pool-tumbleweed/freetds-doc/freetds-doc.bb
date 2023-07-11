SUMMARY = "User documentation for FreeTDS"
DESCRIPTION = "The freetds-doc package contains the useguide and reference of FreeTDS \
and can be installed even if FreeTDS main package is not installed"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.18"

RPM_NAME = "freetds-doc-1.3.18-1.1.aarch64.rpm"
RPM_HASH = "4c3a1cb474c50890c80c8b7c73b55a9db5e678c8ec5bd1583f4dddd43d09fb580f41bbc69779ef0e7c13a3e80308588b4abf8ea250f94b1c254ecf0e3f384697"

RPROVIDES:${PN} += "freetds-doc"

RDEPENDS:${PN} += ""

inherit rpm
