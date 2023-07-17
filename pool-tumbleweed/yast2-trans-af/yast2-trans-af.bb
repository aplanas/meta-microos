SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-af-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "ce92bf30e27362edf6f7d3e9e5f752c972d6c25c7834c0e8b0d0894988d55f593aeb72ebfa7e23247b28b04e5327fca5262e48d3c9eeafef8ab07eb566aec1e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-af \
yast2-trans-af"

RDEPENDS:${PN} += ""

inherit rpm
