SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "f97c89290c12b4d28576b1453c26ca2a371e2481c8d40a27b27b61b1b5a669476d5fe36a2fd361bc8a27a66c728b3065777fba4d7e0d15be6c94dad2f6a811be"

RPROVIDES:${PN} += "python3.9dist-matplotlib \
python39-matplotlib \
python39-matplotlib-gtk \
python3dist-matplotlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-Cycler \
python39-FontTools \
python39-Pillow \
python39-contourpy \
python39-kiwisolver \
python39-numpy \
python39-packaging \
python39-pyparsing \
python39-python-dateutil"

inherit rpm
