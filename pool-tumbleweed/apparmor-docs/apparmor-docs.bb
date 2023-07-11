SUMMARY = "AppArmor Documentation package"
DESCRIPTION = "This package contains documentation for AppArmor. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-docs-3.1.6-1.1.noarch.rpm"
RPM_HASH = "2a03de6f8c9aa241ee468d760bffa27468df0bd7c9663d545a600c01a0ac460a9a086e81bcdd78ff5f9ef1af8cb64e6e6a7cbbc3adf3ffe328d609b984d1d0c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-docs"

RDEPENDS:${PN} += ""

inherit rpm
