SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python310-PyPrind-2.11.3-1.3.noarch.rpm"
RPM_HASH = "cc895e0c756781cc0f7673f106c8a24fc870a8b1034cce44eaea12662b3d812dd6c88a7581f4b7b8ea88c0fa7ea5e0591cfbe00ed05c92f94331544ab717e71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPrind \
python3.10dist-pyprind \
python310-PyPrind \
python3dist-pyprind"

RDEPENDS:${PN} += "python-abi \
python310-psutil"

inherit rpm
