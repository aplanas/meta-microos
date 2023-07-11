SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python39-PeakUtils-1.3.4-1.3.noarch.rpm"
RPM_HASH = "63bd3c6cf44decf241b91d5c447444a53618303df293aeb9df4582df07688b467363bc34f51f7315598aa1759185b3cd14fe7290a02cc3e995d0ecfc9f49949b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-peakutils \
python39-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-scipy"

inherit rpm
