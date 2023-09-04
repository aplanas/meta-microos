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

RPM_NAME = "python310-seaborn-0.12.2-2.1.noarch.rpm"
RPM_HASH = "bcdf0526271d7a702666d60ca0940724517cf0f3ec6addbb506c24fca9667af2f17cf8be46cd8ad6d678dd0e8e5dbcd0e4ea9d54506cdedc9b5629871ade69db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-seaborn \
python310-seaborn \
python3dist-seaborn"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-pandas"

inherit rpm
