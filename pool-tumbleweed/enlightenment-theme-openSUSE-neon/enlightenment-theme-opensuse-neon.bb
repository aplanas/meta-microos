SUMMARY = "openSUSE theme for Enlightenment"
DESCRIPTION = "openSUSE, theme for Enlightenment"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-neon-20220219.1.26-1.10.noarch.rpm"
RPM_HASH = "55188f5f181382ab7a01c8b310384fd5768e431252631a54ce1e07f87845d3723ef141de1e8d72b270b7abb6ddbd3c715318a754b44aed54fc0ce82aaaa33ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-neon"

RDEPENDS:${PN} += ""

inherit rpm
