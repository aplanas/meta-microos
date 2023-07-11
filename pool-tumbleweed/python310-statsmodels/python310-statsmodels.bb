SUMMARY = "A Python module that allows users to explore data"
DESCRIPTION = "Statsmodels is a Python module that allows users to explore data, \
estimate statistical models, and perform statistical tests. \
An extensive list of descriptive statistics, statistical tests, \
plotting functions, and result statistics are available for different \
types of data and each estimator. Researchers across fields may find \
that statsmodels fully meets their needs for statistical computing \
and data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python310-statsmodels-0.14.0-1.1.aarch64.rpm"
RPM_HASH = "d3e3e0b51bffc30116581273c57999960f2943dedf5ac570018fede2b5e6c0e0ba585c230e5b08916ceb3e75ff912770e5fdf6ba2a8f2343fb55d9658c3163ef"

RPROVIDES:${PN} += "python3.10dist-statsmodels \
python310-statsmodels \
python3dist-statsmodels"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy \
python310-packaging \
python310-pandas \
python310-patsy \
python310-scipy"

inherit rpm
