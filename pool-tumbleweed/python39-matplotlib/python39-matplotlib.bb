SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "0c2b1ee0be1081e0ded66009a9d72c1c06be52c42ff205ea3ff728ebaad736f4c1c454af6ac2900e20acd5e53c3f9389b30596ef612397b55ca7363cf4427c99"

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
