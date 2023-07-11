SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "ebbfb675fbc5e40a871a9570a195c83d702763fbe9bb7fc66344f3173a0e3df6a54de90eb3a473754b3b5e78435635a1ed2d84c47d028f015a0cffff598c7009"

RPROVIDES:${PN} += "python3.10dist-matplotlib \
python310-matplotlib \
python310-matplotlib-gtk \
python3dist-matplotlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-Cycler \
python310-FontTools \
python310-Pillow \
python310-contourpy \
python310-kiwisolver \
python310-numpy \
python310-packaging \
python310-pyparsing \
python310-python-dateutil"

inherit rpm
