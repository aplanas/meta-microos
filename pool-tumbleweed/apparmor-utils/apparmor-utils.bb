SUMMARY = "AppArmor User-Level Utilities Useful for Creating AppArmor Profiles"
DESCRIPTION = "This package provides the aa-logprof, aa-genprof, aa-autodep, \
aa-enforce, and aa-complain tools to assist with profile authoring. \
Besides it provides the aa-unconfined server information tool. \
It is part of a suite of tools that used to be named SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-3.1.6-2.2.noarch.rpm"
RPM_HASH = "e43fa7fb9d266a260a80f142153abb4f24ca9b6a603de793be7e5b28094eeffb52455872abeb8c076ec31528ec95d383031a023f1b4ee462c38098d7a4e8341a"
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
