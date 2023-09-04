SUMMARY = "Auxiliary schema data for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the architecture independent files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "gweather4-data-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "33ea19f00e9cce7cee6c22076e9c962692c0b63e7367fcfd0fbf2f7fc764585905464adac0600e1204adc0a55bce4a48d08fbb658e65b30929dd94ac33b2ddb5"

RPROVIDES:${PN} += "gweather4-data \
libgweather4"

RDEPENDS:${PN} += "libgweather-4-0"

inherit rpm
