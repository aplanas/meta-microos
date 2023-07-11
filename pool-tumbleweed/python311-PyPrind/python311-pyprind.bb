SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python311-PyPrind-2.11.3-1.5.noarch.rpm"
RPM_HASH = "edb161adf29a9b012261353dc144be27bf52c3284c0d476e102875f440774a1a3964087e9c9e34e312ef5cfa3ed7e8771b70cdc95828bc106deee933e22088b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPrind \
python3.11dist-pyprind \
python311-PyPrind \
python3dist-pyprind"

RDEPENDS:${PN} += "python-abi \
python311-psutil"

inherit rpm
