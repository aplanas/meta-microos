SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-jv-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "689ecbc19e99dfd8771ecf276c87c7bcee1a72ff701b079371e83184bca31d1e448bd6317e3179bad4fa6d480603947635dd7a59c343a78d878c07858afc2366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-jv \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm
