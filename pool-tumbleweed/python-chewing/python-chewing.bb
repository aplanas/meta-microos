SUMMARY = "Python bindings for libchewing"
DESCRIPTION = "This package contains python bindings for chewing, an intelligent phonetic \
input method library for traditional Chinese. \
 \
Only input method framework written in python (like very old versions of ibus) \
or developers will need it."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "python-chewing-0.5.1+git20200627.452f622-1.10.aarch64.rpm"
RPM_HASH = "dadd3f043f7f0e736d04c3f2c7ed3a11a345495b321a334a7deadcaf5efa7c46ac2e4f61bd980565a064082ce6e33501bdf44a1196ec13818b7e8dc3af50eecc"

RPROVIDES:${PN} += "python-chewing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
