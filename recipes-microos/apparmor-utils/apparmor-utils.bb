SUMMARY = "AppArmor User-Level Utilities Useful for Creating AppArmor Profiles"
DESCRIPTION = "This package provides the aa-logprof, aa-genprof, aa-autodep, \
aa-enforce, and aa-complain tools to assist with profile authoring. \
Besides it provides the aa-unconfined server information tool. \
It is part of a suite of tools that used to be named SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "apparmor-utils-3.1.4-1.1.noarch.rpm"
RPM_HASH = "70c2aa7c181ad95a48bfc1a1d762acac70df99a5fd8cba61c9c46a2ce5db11e56cb915930171c403cdb9dc346a061b656e29542abdf9e53e623994e45b91ee3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils \
config(apparmor-utils)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
apparmor-parser \
libapparmor1 \
python3-apparmor \
python3-base \
python3-notify2 \
python3-psutil"

inherit rpm
