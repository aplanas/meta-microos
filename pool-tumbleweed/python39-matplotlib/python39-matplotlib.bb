SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "897d79787e2c63f93d4a99c56297841c9d5d8b3d248de2bb0371d8471a27da19be9e798c3319ce19da1d03a1b95b700ed95575f5a2be85265b34dcf35eabe0c3"

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
