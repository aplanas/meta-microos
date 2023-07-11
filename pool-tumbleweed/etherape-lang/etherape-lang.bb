SUMMARY = "Translations for package etherape"
DESCRIPTION = "Provides translations for the 'etherape' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "etherape-lang-0.9.20-3.4.noarch.rpm"
RPM_HASH = "761520c97b4807036f226438a4a20c74bba82d409574f663069243719267ee2efa9ab6f7004f595bb28e700a705c33aebaf2e071a073f60b49a706e17ad10cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etherape-lang \
etherape-lang-all \
locale-etherape-de \
locale-etherape-es \
locale-etherape-fr \
locale-etherape-it \
locale-etherape-nl \
locale-etherape-ru \
locale-etherape-sv \
locale-etherape-tr"

RDEPENDS:${PN} += "etherape"

inherit rpm
