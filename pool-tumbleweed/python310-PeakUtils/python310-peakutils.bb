SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python310-PeakUtils-1.3.4-1.1.noarch.rpm"
RPM_HASH = "9f0a50bdb4de2a0ad7cf9c29ff1be53db393256fd790f8d24fb0e30e3bb85f26556b87c86b3267b84c069ed358f922cf86e10af3f16333d8f55be8979524651e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PeakUtils \
python3.10dist(peakutils) \
python310-PeakUtils \
python3dist(peakutils)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-scipy"

inherit rpm
