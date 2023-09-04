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

RPM_NAME = "python311-seaborn-0.12.2-2.1.noarch.rpm"
RPM_HASH = "275eaa83f8e765a7e8904518b526b8fad48ab53bc794f00fbcbefcf92a4ea1f8490a18105aa450b8a02013341a90ec5c2d7b9d61ffa961fd1e8500e7c2b5faa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-seaborn \
python3.11dist-seaborn \
python311-seaborn \
python3dist-seaborn"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-pandas"

inherit rpm
