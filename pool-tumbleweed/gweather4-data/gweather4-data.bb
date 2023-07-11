SUMMARY = "Auxiliary schema data for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the architecture independent files."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "gweather4-data-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "43cbf09d3e33aed49ce55dd54fb5474592f1aed97b2b6779f666794474d0a3105b45b6c3bb970e5309276c9eef2e6ec53a46f1d5bf45e740f7fd3afcdce1f841"

RPROVIDES:${PN} += "gweather4-data \
libgweather4"

RDEPENDS:${PN} += "libgweather-4-0"

inherit rpm
