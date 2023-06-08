SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-locale-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "7cb8a93670fd691e82fedccb853180a94b1c6ddefb45cef18982cf97843ca4c17ac6f95a3727dec663094b20f04ad9ba8f10eaaa10627d6592a28937efc3bafd"

RPROVIDES:${PN} += "gcc11-locale gcc11-locale(aarch-64) locale(gcc11:be) locale(gcc11:ca) locale(gcc11:da) locale(gcc11:de) locale(gcc11:el) locale(gcc11:eo) locale(gcc11:es) locale(gcc11:fi) locale(gcc11:fr) locale(gcc11:hr) locale(gcc11:id) locale(gcc11:ja) locale(gcc11:nl) locale(gcc11:pt_BR) locale(gcc11:ru) locale(gcc11:sr) locale(gcc11:sv) locale(gcc11:tr) locale(gcc11:uk) locale(gcc11:vi) locale(gcc11:zh_CN) locale(gcc11:zh_TW)"
RDEPENDS:${PN} += "gcc11"

inherit rpm
