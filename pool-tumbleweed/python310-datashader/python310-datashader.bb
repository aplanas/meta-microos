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

RPM_NAME = "python310-datashader-0.15.0-1.3.noarch.rpm"
RPM_HASH = "51bc11d3fbd4119c1e057fb0fc1119c82b9ae4c939cb68f43944e43b97027bcb3e6682ab9f2b9672dace7ae26a58a57d6d5e5b127544eace3451d1bc372c2bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-datashader \
python310-datashader \
python3dist-datashader"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-DataShape \
python310-Pillow \
python310-colorcet \
python310-dask-dataframe \
python310-numba \
python310-numpy \
python310-pandas \
python310-param \
python310-pyct \
python310-requests \
python310-scipy \
python310-toolz \
python310-xarray \
update-alternatives"

inherit rpm
