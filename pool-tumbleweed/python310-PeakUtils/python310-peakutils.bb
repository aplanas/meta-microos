SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python310-PeakUtils-1.3.4-1.3.noarch.rpm"
RPM_HASH = "53364b9352cbc3dc89179c4fdc573ca8a215ccdc0ab879d5e24e696ab36fb9e2d345a04826d067604865ac08e5a9ec82a4ba8c561d964578ee12a6e208c7851b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-peakutils \
python310-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy"

inherit rpm
