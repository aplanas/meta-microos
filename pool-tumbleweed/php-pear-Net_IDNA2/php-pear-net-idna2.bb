SUMMARY = "PHP library for Punycode encoding and decoding"
DESCRIPTION = "The package provides a class which allows one to convert from and to \
internationalized domain names (RFC 3490). They can be used with \
various registries worldwide to be translated between their original \
(localized) form and their encoded form as it will be used in the DNS \
(Domain Name System)."
LICENSE = "LGPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "php-pear-Net_IDNA2-0.2.0-1.10.noarch.rpm"
RPM_HASH = "4d5a86a4aed611599fbe36a5c38b59c5d9c19f5d3d84973f4b8eea9333e1a8834b7ec92f3421007fd6d5490c8c2575c1f729b30f9b573ff18469eff8b20a7df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Net-IDNA2 \
php5-pear-Net-IDNA2 \
php7-pear-Net-IDNA2"

RDEPENDS:${PN} += "/bin/sh \
php-pear"

inherit rpm
