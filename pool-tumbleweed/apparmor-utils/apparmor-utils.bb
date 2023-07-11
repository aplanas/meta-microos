SUMMARY = "AppArmor User-Level Utilities Useful for Creating AppArmor Profiles"
DESCRIPTION = "This package provides the aa-logprof, aa-genprof, aa-autodep, \
aa-enforce, and aa-complain tools to assist with profile authoring. \
Besides it provides the aa-unconfined server information tool. \
It is part of a suite of tools that used to be named SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-3.1.6-1.1.noarch.rpm"
RPM_HASH = "deac315879ad9c9a23eea0b25a772629fe1cd1603ff8d1ff1b2b3a855eaa896d5445313b734f546bb105d0da01403b09dbe215cffdf0c5310b9727e69d5f59ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils \
config-apparmor-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
apparmor-parser \
libapparmor1 \
python3-apparmor \
python3-base \
python3-notify2 \
python3-psutil"

inherit rpm
