SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-bg-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "6b8fb9b18fdc26a67becf534f5d394f41ec9a9778f65f07a3f74c7ae6eb6582afb65f7d72810f1e46265e38d6c9302441c5273e35e31dd4c71aeae8aff7e8a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bg \
yast2-trans-bg"

RDEPENDS:${PN} += ""

inherit rpm
