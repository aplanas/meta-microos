SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "e2da5efa01c10f9c0d4086d4a8521f58a88c00ad47b4980f24afa579b2e2c90f091cfee077e738bf4f8444b155e265cbd5b9a9d6ceff1279e3ffe162b2ddedcb"

RPROVIDES:${PN} += "python3.11dist-matplotlib \
python311-matplotlib \
python311-matplotlib-gtk \
python3dist-matplotlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-Cycler \
python311-FontTools \
python311-Pillow \
python311-contourpy \
python311-kiwisolver \
python311-numpy \
python311-packaging \
python311-pyparsing \
python311-python-dateutil"

inherit rpm
