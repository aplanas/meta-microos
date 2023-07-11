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

RPM_NAME = "python310-seaborn-0.12.2-1.5.noarch.rpm"
RPM_HASH = "9088ab7d59c28a6d5075225f34fea57423f955d4de136044d74d4b7ecaabd9b9e904d3c9868a03e1e4131d088c73f407250eb429018f1eacf103a3df777bc30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-seaborn \
python310-seaborn \
python3dist-seaborn"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-pandas"

inherit rpm
