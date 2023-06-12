SUMMARY = "AppArmor Documentation package"
DESCRIPTION = "This package contains documentation for AppArmor. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.4"

RPM_NAME = "apparmor-docs-3.1.4-1.1.noarch.rpm"
RPM_HASH = "9687f000a054f39d4337bd7e3fb03379108622c6b74b9c3000fa3ff38ad6042f101c860d79acda4f62fdd67b2514eca57d10a30d53b0633890ff4376fad32f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-docs"
RDEPENDS:${PN} += ""

inherit rpm
