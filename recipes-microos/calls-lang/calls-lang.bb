SUMMARY = "Translations for package calls"
DESCRIPTION = "Provides translations for the 'calls' package."
LICENSE = "GPL-3.0-only & MIT"

PV = "44.1"

RPM_NAME = "calls-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "481cc026df1c73afd704bd9dde6f1bcd1a6ed06cdcc5b699a4f428d185db86a152a21a7349436732b6d50fe54c72ac8ce64c3fff8071facbcfd52cf66062681d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calls-lang \
calls-lang-all \
locale(calls:be) \
locale(calls:bg) \
locale(calls:ca) \
locale(calls:cs) \
locale(calls:da) \
locale(calls:de) \
locale(calls:el) \
locale(calls:en_GB) \
locale(calls:eo) \
locale(calls:es) \
locale(calls:eu) \
locale(calls:fa) \
locale(calls:fi) \
locale(calls:fr) \
locale(calls:fur) \
locale(calls:gl) \
locale(calls:he) \
locale(calls:hi) \
locale(calls:hr) \
locale(calls:hu) \
locale(calls:id) \
locale(calls:it) \
locale(calls:ja) \
locale(calls:ka) \
locale(calls:ko) \
locale(calls:lt) \
locale(calls:nl) \
locale(calls:oc) \
locale(calls:pl) \
locale(calls:pt) \
locale(calls:pt_BR) \
locale(calls:ro) \
locale(calls:ru) \
locale(calls:sk) \
locale(calls:sl) \
locale(calls:sr) \
locale(calls:sv) \
locale(calls:tr) \
locale(calls:uk) \
locale(calls:vi) \
locale(calls:zh_CN) \
locale(calls:zh_TW)"
RDEPENDS:${PN} += "calls"

inherit rpm
