SUMMARY = "Russian (русский) Dictionary for Aspell"
DESCRIPTION = "A Russian  (русский) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Permissive-Modify-By-Patch"

PV = "0.99.f7.1"

RPM_NAME = "aspell-ru-0.99.f7.1-2.14.aarch64.rpm"
RPM_HASH = "4f68e5b91fb2505553adef0c974a6e8160842981f27ff7af85be7ac6d55bca151ef73139052228b738abc08d822b4652ea553b8fe65d4d77d8c5855d9e0ab3c3"

RPROVIDES:${PN} += "aspell-ru \
locale-aspell-ru"

RDEPENDS:${PN} += ""

inherit rpm
