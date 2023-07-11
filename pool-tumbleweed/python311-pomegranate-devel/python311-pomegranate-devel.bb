SUMMARY = "Development files for python311-pomegranate"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed. \
 \
This package provides development files needed to run software that depends on \
Pomegranate."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-pomegranate-devel-0.12.0-2.15.aarch64.rpm"
RPM_HASH = "26543902cf4557aa2e9870dca47952be7134835562fcbbce405452522762f9354c0e21e1323aed190d9b492eefde1d3589d7e69d86c8366cfcacdf8cde45e627"

RPROVIDES:${PN} += "python3-pomegranate-devel \
python311-pomegranate-devel"

RDEPENDS:${PN} += "python311-pomegranate"

inherit rpm
