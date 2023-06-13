SUMMARY = "Statistical data visualization for python"
DESCRIPTION = "Seaborn is a library for making attractive and informative \
statistical graphics in Python. It is built on top of \
matplotlib and tightly integrated with the PyData stack, \
including support for numpy and pandas data structures and \
statistical routines from scipy and statsmodels. \
 \
Some of the features that seaborn offers are: \
- Several built-in themes that improve on the default matplotlib \
  aesthetics \
- Tools for choosing color palettes to make beautiful plots that \
  reveal patterns in your data \
- Functions for visualizing univariate and bivariate distributions \
  or for comparing them between subsets of data \
- Tools that fit and visualize linear regression models for different \
  kinds of independent and dependent variables \
- Functions that visualize matrices of data and use clustering \
  algorithms to discover structure in those matrices \
- A function to plot statistical timeseries data with flexible \
  estimation and representation of uncertainty around the estimate \
- High-level abstractions for structuring grids of plots that let you \
  easily build complex visualizations"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "0.12.2"

RPM_NAME = "python310-seaborn-0.12.2-1.3.noarch.rpm"
RPM_HASH = "b33600b61b1ccfab0b3a6f3c890dcb581620575c0580e300a7a1ebe5664c3e39e86395e7f9e4aae29798f16c3fc041f781952bcbbd12a4d4e04827d1c4095fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-seaborn \
python3.10dist(seaborn) \
python310-seaborn \
python3dist(seaborn)"

RDEPENDS:${PN} += "python(abi) \
python310-matplotlib \
python310-numpy \
python310-pandas"

inherit rpm
