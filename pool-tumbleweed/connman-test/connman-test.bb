SUMMARY = "Test and example scripts for connman"
DESCRIPTION = "Provides test and example scripts for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-test-1.41-4.7.aarch64.rpm"
RPM_HASH = "3a2101c1093ac809259db95615a95eb096dae166e8f50ea531f4f06d53a95624c10c755f5a42102ab683d1d84adc7fc33493f1505ad4dd30cead5aef44128ef6"

RPROVIDES:${PN} += "connman-test"

RDEPENDS:${PN} += "/usr/bin/python \
connman"

inherit rpm
