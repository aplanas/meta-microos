SUMMARY = "Documentation for iio-sensor-proxy"
DESCRIPTION = "This package contains the documentation for iio-sensor-proxy."
LICENSE = "GPL-3.0-only"

PV = "3.4"

RPM_NAME = "iio-sensor-proxy-doc-3.4-2.4.noarch.rpm"
RPM_HASH = "c971bdffa75048c05bc0da1d38a654c79a9f6ac93f9e365ffcab8afbf2c0dbb7a58a401fc9d906c5c933551c0f188f90c1b063ae62210103b04275edb92e0974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iio-sensor-proxy-doc"

RDEPENDS:${PN} += ""

inherit rpm
