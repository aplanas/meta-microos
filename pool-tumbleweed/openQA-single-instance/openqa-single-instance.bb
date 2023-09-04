SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-single-instance-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "4978f2ee82e747abd566ef70bef8786d8536745a2cb349256fd3f2e86e84503ea5771b544ceaab952f565f29bc52171d8776769497269ba5c511964a62148dfb"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
