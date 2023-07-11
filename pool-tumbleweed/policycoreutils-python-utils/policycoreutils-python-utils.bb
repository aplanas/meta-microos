SUMMARY = "SELinux policy core python utilities"
DESCRIPTION = "The policycoreutils-python-utils package contains the management tools \
use to manage an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-python-utils-3.5-4.1.noarch.rpm"
RPM_HASH = "5940b4fa21c707b5590b7b131fecf2e7ed17fd97343df8b55184093ad56354f2eb22daef4ce1d447e315d389da394e6d4c04a6a3c0cb2d6ed380b8ee0678f502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-policycoreutils"

inherit rpm
