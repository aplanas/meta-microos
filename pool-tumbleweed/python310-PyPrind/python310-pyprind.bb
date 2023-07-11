SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python310-PyPrind-2.11.3-1.5.noarch.rpm"
RPM_HASH = "e3f278737720e5668e8cc95ffa7362a51a3cfeafb99edfe4e01dde6347c1f11d03abe5711453ef75406963e0bf81aded9329d0a02942d2ddedd115c93afa1d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyprind \
python310-PyPrind \
python3dist-pyprind"

RDEPENDS:${PN} += "python-abi \
python310-psutil"

inherit rpm
