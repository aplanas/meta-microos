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

RPM_NAME = "python311-statsmodels-0.14.0-1.1.aarch64.rpm"
RPM_HASH = "74a763d10840b6081e1be2c933329eeddc7a6ca2cee2fc51e8cbe39fc7de65cc38dacb9de158d8613ba383f16af330b666fe336d06a7edc9357f6a4546d0dc98"

RPROVIDES:${PN} += "python3-statsmodels \
python3.11dist-statsmodels \
python311-statsmodels \
python3dist-statsmodels"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-numpy \
python311-packaging \
python311-pandas \
python311-patsy \
python311-scipy"

inherit rpm
