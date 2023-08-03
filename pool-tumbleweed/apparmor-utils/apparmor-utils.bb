SUMMARY = "AppArmor User-Level Utilities Useful for Creating AppArmor Profiles"
DESCRIPTION = "This package provides the aa-logprof, aa-genprof, aa-autodep, \
aa-enforce, and aa-complain tools to assist with profile authoring. \
Besides it provides the aa-unconfined server information tool. \
It is part of a suite of tools that used to be named SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-3.1.6-2.1.noarch.rpm"
RPM_HASH = "4efbd0deb412acfd6829ee7ec12b01461323b185bf8c1c8bb144645379554d47e4d5a8f4f67ad0afe3d25d6017b05c50e3d62e7035c8f92b8444b2c39b06a3dc"
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
