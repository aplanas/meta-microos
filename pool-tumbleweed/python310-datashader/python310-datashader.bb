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

RPM_NAME = "python310-datashader-0.15.0-1.1.noarch.rpm"
RPM_HASH = "8860b400f97a6c075c9e2a5bd26aada7be815fe1c1b1e16bcc38a7e1dd2e9b8d2b4e03c29d2e860843a8c49fb81b37413d1b1391a45891e72cd6d1a2548af926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-datashader \
python3.10dist(datashader) \
python310-datashader \
python3dist(datashader)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
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
