SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-plot-2.0.3-1.2.noarch.rpm"
RPM_HASH = "045817213951171008e91a4bcf3220c2e9c0958214b55939c3d63896aed6cc7998184ae0bcb880fb33f0e4accd6cffca8aadc345cad13ab8484a27fea600024d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-plot"

RDEPENDS:${PN} += "python39-matplotlib \
python39-pandas"

inherit rpm
