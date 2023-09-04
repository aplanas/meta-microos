SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python311-scikit-image-0.21.0-2.1.aarch64.rpm"
RPM_HASH = "88824fdb7c3af67c2e0557e62ece499745211ea0156b7fb022f839485fcbcc20cc262a713b40e54d35f354336a314eb9c96faf306f3f0570594da7f6cd2fa753"

RPROVIDES:${PN} += "python3-scikit-image \
python3.11dist-scikit-image \
python311-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-Pillow \
python311-PyWavelets \
python311-imageio \
python311-lazy-loader \
python311-networkx \
python311-numpy \
python311-packaging \
python311-scipy \
python311-tifffile \
update-alternatives"

inherit rpm
