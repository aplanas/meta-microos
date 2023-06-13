SUMMARY = "Chinese Lunar calendar"
DESCRIPTION = "This is the traditional Chinese calendar application."
LICENSE = "GPL-2.0+"

PV = "3.0.0+git20191124.f91a880"

RPM_NAME = "lunar-calendar-3.0.0+git20191124.f91a880-1.15.aarch64.rpm"
RPM_HASH = "62d24c882fca0ccc376b57e1eb6e670cc904199c6f7eb5afac0d9e1e2ce0ac8ef72e1bed6884cf35b2c36ad03d0be3533a817497a438ee7971ef14726255ac41"

RPROVIDES:${PN} += "lunar-calendar \
lunar-calendar(aarch-64)"

RDEPENDS:${PN} += "liblunar-calendar-3_0-1"

inherit rpm
