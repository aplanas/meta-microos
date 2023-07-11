SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "4b4bc411517d45591935e01584b74b8d496bd3c34c1f8b0ba36cd2ce2d88895560cce4c49821568eabd93eb2fd35769ec56f7b03ca20df965c5b55c2a486625f"

RPROVIDES:${PN} += "python3-matplotlib \
python3-matplotlib-gtk \
python3.11dist-matplotlib \
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
