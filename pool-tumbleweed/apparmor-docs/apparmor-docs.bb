SUMMARY = "AppArmor Documentation package"
DESCRIPTION = "This package contains documentation for AppArmor. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-docs-3.1.6-4.1.noarch.rpm"
RPM_HASH = "9ecb28d489abf82ea1a26f90945ee7be4089adcd9964ff85ee2fe02c562d4bab02fe1aee72896280aad3eb3da7b5f651b293dfd34540401635a221fb07c8450d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-docs"

RDEPENDS:${PN} += ""

inherit rpm
