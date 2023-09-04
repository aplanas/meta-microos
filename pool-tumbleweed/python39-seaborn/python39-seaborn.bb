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

RPM_NAME = "python39-seaborn-0.12.2-2.1.noarch.rpm"
RPM_HASH = "142413e8ed2677c31386ea1a7429f5b6e9806eff68443e9ca7b24cf3536c9246104a243c576ae0f93d7198369616ffca89bf226ab127fb5b5915fa0c77371da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-seaborn \
python39-seaborn \
python3dist-seaborn"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-pandas"

inherit rpm
