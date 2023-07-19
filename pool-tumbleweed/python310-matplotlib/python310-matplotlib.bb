SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "fa2e640da2775d16b26064d8d6a6af1c707d842f7051ac33152293979338ebcefdd0d79c7daf58f535d0c3bc74f558a827d5d9745475f5466081505a0d3f55a3"

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
