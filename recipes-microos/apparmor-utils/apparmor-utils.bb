SUMMARY = "AppArmor User-Level Utilities Useful for Creating AppArmor Profiles"
DESCRIPTION = "This package provides the aa-logprof, aa-genprof, aa-autodep, \
aa-enforce, and aa-complain tools to assist with profile authoring. \
Besides it provides the aa-unconfined server information tool. \
It is part of a suite of tools that used to be named SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "apparmor-utils-3.1.3-2.1.noarch.rpm"
RPM_HASH = "c9e80709478c262617595d4883d16a941360528f038120aa5dfdbbae44aa1a03834156bac813cd70a95ec3319cfe2acf3786512dd9d2f54a752e0e948566acc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils config(apparmor-utils)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 apparmor-parser libapparmor1 python3-apparmor python3-base python3-notify2 python3-psutil"

inherit rpm
