SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "b4ff3ea9d5c5f6cd937ec6ed73aae95ede938b8b1b8447ad509722dd78f2aad3732d55ad55a24495b30cec76634bb3929105e0c388e51222082b51380c8ff064"

RPROVIDES:${PN} += "python3-matplotlib \
python3-matplotlib-gtk \
python3.10dist-matplotlib \
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
