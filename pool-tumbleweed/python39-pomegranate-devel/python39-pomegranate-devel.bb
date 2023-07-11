SUMMARY = "Development files for python39-pomegranate"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed. \
 \
This package provides development files needed to run software that depends on \
Pomegranate."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-pomegranate-devel-0.12.0-2.15.aarch64.rpm"
RPM_HASH = "c53989e344f50ead0fd1b3289bee85eefc13278eaff0d2f6649d60c5d7515a222c675d448cf47c6334ab391e3cd1db1671862a0c7065aba8083deedeb0ede172"

RPROVIDES:${PN} += "python39-pomegranate-devel"

RDEPENDS:${PN} += "python39-pomegranate"

inherit rpm
