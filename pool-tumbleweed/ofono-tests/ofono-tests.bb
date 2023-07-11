SUMMARY = "Test Scripts for oFono"
DESCRIPTION = "Scripts for testing oFono and its functionality."
LICENSE = "GPL-2.0-only"

PV = "1.34"

RPM_NAME = "ofono-tests-1.34-1.8.aarch64.rpm"
RPM_HASH = "c35c57725b6a5696bac92f40c9945258defeb0b28c9da0f03c44a059a4219c7159fd52a4ef7555e9e1cdf5a36b42178a9dadc9bb5ae087e32d1ba275c902791d"

RPROVIDES:${PN} += "ofono-test \
ofono-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
ofono"

inherit rpm
