SUMMARY = "Data visualization toolchain based on aggregating into a grid"
DESCRIPTION = "Traditional visualization systems treat plotting as a unitary process \
transforming incoming data into an onscreen or printed image, with \
parameters that can be specified beforehand that affect the final \
result.  While this approach works for small collections of data that \
can be viewed in their entirety, the visualization for large datasets \
is often the only way to understand what the data consists of, and \
there is no objective way to set the parameters to reveal this data. \
 \
The datashader library breaks up the rendering pipeline into a series \
of stages where user-defined computations can be performed, allowing \
the visualization to adapt to and reveal the underlying properties of \
the dataset, i.e. the datashader pipeline allows computation *on \
the visualization*, not just on the dataset, allowing it to do \
automatic ranging and scaling that takes the current visualization \
constraints into account.  For instance, where a traditional system \
would use a transparency/opacity parameter to show the density of \
overlapping points in a scatterplot, datashader can automatically \
calculate how many datapoints are mapped to each pixel, scaling the \
representation to accurately convey the data at every location, with no \
saturation, overplotting, or underplotting issues."
LICENSE = "BSD-3-Clause"

PV = "0.15.0"

RPM_NAME = "python311-datashader-0.15.0-1.1.noarch.rpm"
RPM_HASH = "df4e49c964f13e8675ea0d9c1d60970caea2904762e8c708767294a2cfad1abe8cf62f00c13b312dd8418c4740a0bdb5c145eb33b14241c4700f5c3857c9e815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-datashader \
python311-datashader \
python3dist-datashader"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-DataShape \
python311-Pillow \
python311-colorcet \
python311-dask-dataframe \
python311-numba \
python311-numpy \
python311-pandas \
python311-param \
python311-pyct \
python311-requests \
python311-scipy \
python311-toolz \
python311-xarray \
update-alternatives"

inherit rpm
