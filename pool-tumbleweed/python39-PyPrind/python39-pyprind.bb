SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python39-PyPrind-2.11.3-1.5.noarch.rpm"
RPM_HASH = "363e9d6ced5cf88a02c8d7d51c3a2b039e87beceee0430b03898f0d9cc2938cd06fcbbd5f3533ebc56c6037c05ded6032a98714be59e503f08816e82012f3616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyprind \
python39-PyPrind \
python3dist-pyprind"

RDEPENDS:${PN} += "python-abi \
python39-psutil"

inherit rpm
