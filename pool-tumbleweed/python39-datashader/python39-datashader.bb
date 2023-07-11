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

RPM_NAME = "python39-datashader-0.15.0-1.3.noarch.rpm"
RPM_HASH = "876df77893fe08540b838bcd34538810b28f4a398fbf048a07e06e01d0c08a79e9d9bcfbaba98daf584e3d026da3884bfcccf0e014fe1dadb34008e6fd57e63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-datashader \
python39-datashader \
python3dist-datashader"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-DataShape \
python39-Pillow \
python39-colorcet \
python39-dask-dataframe \
python39-numba \
python39-numpy \
python39-pandas \
python39-param \
python39-pyct \
python39-requests \
python39-scipy \
python39-toolz \
python39-xarray \
update-alternatives"

inherit rpm
