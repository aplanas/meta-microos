SUMMARY = "openSUSE branding of MozillaFirefox"
DESCRIPTION = "This package provides openSUSE look and feel for Firefox."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "68"

RPM_NAME = "firefox-esr-branding-openSUSE-68-3.6.aarch64.rpm"
RPM_HASH = "bb27730bb29412e0b93e2d264f9c35b643659b670010f642ec353b753082582d2e55d5a892f636a996484ee5fc6dccdb211c3c8da5741aa34f68bdc6e5903fbe"

RPROVIDES:${PN} += "firefox-esr-branding firefox-esr-branding-openSUSE firefox-esr-branding-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
