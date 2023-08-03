SUMMARY = "Documentation for iio-sensor-proxy"
DESCRIPTION = "This package contains the documentation for iio-sensor-proxy."
LICENSE = "GPL-3.0-only"

PV = "3.5"

RPM_NAME = "iio-sensor-proxy-doc-3.5-1.1.noarch.rpm"
RPM_HASH = "ca11693fd145b92e95f0cbd1bf7aff8c476942a5d004ccfe483f463e1b0a31cff6bfd8cc0168542888d6c47d71c6606df62dd983365bbe202d53daeaf97f5c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iio-sensor-proxy-doc"

RDEPENDS:${PN} += ""

inherit rpm
