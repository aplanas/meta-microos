SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-performance-2.0.2-4.1.noarch.rpm"
RPM_HASH = "75d0ce5997c7dc28bdca6c83f3ccc2a08d8f4fa32ff097b2307ee4bbeb59eb2a3029f1398972d0ef32938adc9e2ebf98538ba4a26617b906bc341b9ee3b53db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-performance"

RDEPENDS:${PN} += "python39-Bottleneck \
python39-numba \
python39-numexpr \
python39-pandas"

inherit rpm
