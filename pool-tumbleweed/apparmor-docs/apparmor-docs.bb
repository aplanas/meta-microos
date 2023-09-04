SUMMARY = "AppArmor Documentation package"
DESCRIPTION = "This package contains documentation for AppArmor. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-docs-3.1.6-2.2.noarch.rpm"
RPM_HASH = "8a15dee3af1defc4426794dac1d43532e4e5ffafca97eeb22489f309d2d66c0bf037bfd843c330ab22758aab5d21a0b26848093d6735317fb9a5c56690dd081d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-docs"

RDEPENDS:${PN} += ""

inherit rpm
