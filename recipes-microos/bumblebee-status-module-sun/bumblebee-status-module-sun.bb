SUMMARY = "Widget to display sunrise and sunset times"
DESCRIPTION = "Widget to display sunrise and sunset times."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-sun-2.1.5-3.3.noarch.rpm"
RPM_HASH = "66b08da047e7895d5f9f9b0b2b23d448c93c6ab9cc5bca950b517aaed19428011b842f7cfb4123d77620c5be3182d5895720f94e55a148bf98d94c95dc3aeae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-sun"
RDEPENDS:${PN} += "bumblebee-status python3-python-dateutil python3-suntime"

inherit rpm
