SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-single-instance-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "2bf99bd5b4060ef95c5193e4d2f7ed4a8467b8fe7b9330b8758aeed025bfefab1b57dfdfe64f8d3129f972ec52278de962bd5eed0f7988bafad6a311c6815a1d"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
