SUMMARY = "Documentation for OpenStack reports library"
DESCRIPTION = "The project oslo.reports hosts a general purpose error report generation \
framework, known as the 'guru meditation report'. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python-oslo.reports-doc-2.4.0-1.5.noarch.rpm"
RPM_HASH = "f288f0150dc11430b1af5920e8050e12367cd55586ca90c8d7bc8ebc22e72909787847db86ec8adb8c1a1869e892bb18ee4f286a54d5ed010485611b1968d278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.reports-doc"

RDEPENDS:${PN} += ""

inherit rpm
