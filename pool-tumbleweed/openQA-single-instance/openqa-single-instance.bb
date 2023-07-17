SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-single-instance-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "d87dce3c44993932279c4af544ff19940addeb503756c59de308e3369d0305a7d13e6bc063b77354254e9c00441dc00a1011c0572baeed8463b54eccd2acc0b6"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
