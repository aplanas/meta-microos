SUMMARY = "Examples and Documentation for python-pymisp"
DESCRIPTION = "Examples and HTML documentation for python-pymisp."
LICENSE = "BSD-2-Clause"

PV = "2.4.170.2"

RPM_NAME = "python-pymisp-doc-2.4.170.2-1.1.noarch.rpm"
RPM_HASH = "414a42c72388d52959aea128ad71bd3f2c5b232ed5c48c48a8e1bad753d7bff43d1087e59ce00c0dccbea2886b2ba296bf84d60cfefe299651c310b922e8a74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymisp-doc"

RDEPENDS:${PN} += ""

inherit rpm
