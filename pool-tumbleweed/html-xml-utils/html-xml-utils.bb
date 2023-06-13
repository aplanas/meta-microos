SUMMARY = "A number of utilities for manipulating HTML and XML files"
DESCRIPTION = "HTML-XML-utils provides a number of utilities for manipulating and \
converting HTML and XML files in various ways."
LICENSE = "W3C"

PV = "8.6"

RPM_NAME = "html-xml-utils-8.6-1.1.aarch64.rpm"
RPM_HASH = "de74554cd686779224e71fb45438363c2e3388db0e844e54a5e9218a685aa927e2095867b72fc2f821e23c16ccf5b11e63c281c193527ad1d6cf6bde409ff9ee"

RPROVIDES:${PN} += "html-xml-utils \
html-xml-utils(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libidn2.so.0()(64bit) \
libidn2.so.0(IDN2_0.0.0)(64bit)"

inherit rpm
