SUMMARY = "AppArmor User-Level Utilities Useful for Creating AppArmor Profiles"
DESCRIPTION = "This package provides the aa-logprof, aa-genprof, aa-autodep, \
aa-enforce, and aa-complain tools to assist with profile authoring. \
Besides it provides the aa-unconfined server information tool. \
It is part of a suite of tools that used to be named SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-3.1.6-4.1.noarch.rpm"
RPM_HASH = "94b1e7f5cb957fc69bb84e82dd6e235dc3a96511d2b8c22ad8f9d05e81ca0b6ff8cc5e47d7a22bd2a8c55c71392ea60b71b864a058709cc5d1ffe37aad8401c6"
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
