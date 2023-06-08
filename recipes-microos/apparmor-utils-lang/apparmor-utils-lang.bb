SUMMARY = "Translations for package apparmor-utils"
DESCRIPTION = "Provides translations for the 'apparmor-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "apparmor-utils-lang-3.1.3-2.1.noarch.rpm"
RPM_HASH = "27e8422eab892b25f6975885051ae97f01af885cef100d0dfb9c70686a51f2d93023ba8eed032145fcd84b1d48b96283d1c53c024d98ef2c2059d4d5262f4445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils-lang apparmor-utils-lang-all locale(apparmor-utils:af) locale(apparmor-utils:bs) locale(apparmor-utils:de) locale(apparmor-utils:en_GB) locale(apparmor-utils:es) locale(apparmor-utils:fa) locale(apparmor-utils:fr) locale(apparmor-utils:hi) locale(apparmor-utils:id) locale(apparmor-utils:it) locale(apparmor-utils:ko) locale(apparmor-utils:pl) locale(apparmor-utils:pt) locale(apparmor-utils:pt_BR) locale(apparmor-utils:ru) locale(apparmor-utils:sv) locale(apparmor-utils:tr) locale(apparmor-utils:ug) locale(apparmor-utils:uk) locale(apparmor-utils:zh_CN)"
RDEPENDS:${PN} += "apparmor-utils"

inherit rpm
