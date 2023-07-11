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

RPM_NAME = "python39-statsmodels-0.14.0-1.1.aarch64.rpm"
RPM_HASH = "ff357abd6ac797897a573e1ea0a184d25e190c3bd6646e1d6bedb8ad528fdd7987b29396b2baede09bbe7b4bffb7ed0667fd980e81afd3d2a253606711bc3cb9"

RPROVIDES:${PN} += "python3.9dist-statsmodels \
python39-statsmodels \
python3dist-statsmodels"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-numpy \
python39-packaging \
python39-pandas \
python39-patsy \
python39-scipy"

inherit rpm
