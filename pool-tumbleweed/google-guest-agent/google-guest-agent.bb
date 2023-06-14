SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud Guest Agent"
LICENSE = "Apache-2.0"

PV = "20230510.00"

RPM_NAME = "google-guest-agent-20230510.00-1.1.aarch64.rpm"
RPM_HASH = "7b50dd566fc7aa0923138fd74e8bee6ea71432425a02677c3df5a19ef3018280384174d8e20f09cf9dc38d5f9b8d278101c23e896986fda9ca04ca05dc76cdbd"

RPROVIDES:${PN} += "google-compute-engine-init \
google-guest-agent"

RDEPENDS:${PN} += "/bin/sh \
google-guest-configs"

inherit rpm
