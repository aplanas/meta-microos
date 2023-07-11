SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python311-PeakUtils-1.3.4-1.3.noarch.rpm"
RPM_HASH = "7f2d8bf11d0aa5ca45c7308243f76db85536705cff7f31c0342ca73eb7407a02c90d1d9597539879c7afc941c3056a3d99b0d1eff5dc86619d9b171ba33b2c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PeakUtils \
python3.11dist-peakutils \
python311-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy"

inherit rpm
