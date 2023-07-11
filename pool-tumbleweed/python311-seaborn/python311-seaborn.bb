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

RPM_NAME = "python311-seaborn-0.12.2-1.5.noarch.rpm"
RPM_HASH = "28e8ed40d0b850bed6f49760af07ec4fc376687bc86f5827ae7a9d3ba54d112734444142c38ce1434ba29c060290f695c43b19b6e36d0ce31787067c65217f8c"
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
