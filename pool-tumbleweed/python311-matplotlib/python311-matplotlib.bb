SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "1080d8f09248883482df5031a9943ede374ee50b4aac5a29531ec009b6e8ee840408931be3665724738c0e6f138e9a50877fbdd586c665de70dc22f23e920312"

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
