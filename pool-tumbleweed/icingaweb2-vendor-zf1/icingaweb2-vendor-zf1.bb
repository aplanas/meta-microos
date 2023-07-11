SUMMARY = "Icinga Web 2's fork of Zend Framework 1"
DESCRIPTION = "Icinga Web 2's fork of Zend Framework 1."
LICENSE = "BSD-3-Clause"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-zf1-2.11.4-3.1.noarch.rpm"
RPM_HASH = "9f5d10ac7a4f7895cedacac3683a2196a6affe1a2d3e23a81145ef2c89eeaaa61851842a91997c114c988f16aa78f5a93a7d645eeba5f1cc9b44ab317f9d39b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-Zend \
icingaweb2-vendor-zf1"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
