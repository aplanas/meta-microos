SUMMARY = "Python library to handle pixelated data on the sphere based on HEALPix"
DESCRIPTION = "healpy is a Python package to handle pixelated data on the sphere. It is based \
on the Hierarchical Equal Area isoLatitude Pixelization (HEALPix) scheme and \
bundles the HEALPix C++ library. \
 \
healpy provides utilities to: \
* convert between sky coordinates and pixel indices in HEALPix nested and ring schemes \
* find pixels within a disk, a polygon or a strip in the sky \
* apply coordinate transformations between Galactic, Ecliptic and Equatorial reference frames \
* apply custom rotations either to vectors or full maps \
* read and write HEALPix maps to disk in FITS format \
* upgrade and downgrade the resolution of existing HEALPix maps \
* visualize maps in Mollweide, Gnomonic and Cartographic projections \
* transform maps to Spherical Harmonics space and back using multi-threaded C++ routines \
* compute Auto and Cross Power Spectra from maps and create map realizations from spectra"
LICENSE = "GPL-2.0-only"

PV = "1.16.5"

RPM_NAME = "python311-healpy-1.16.5-1.1.aarch64.rpm"
RPM_HASH = "b8ba40daec5e87112e65375ed38e9cbac336ba403d5dc6b7ca457c1832a25c1a6479caec19efc65ef5629460e6f52aaeb5722635a2a8c3a52a332ed25f2b33d1"

RPROVIDES:${PN} += "python3-healpy \
python3.11dist-healpy \
python311-healpy \
python3dist-healpy"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhealpix-cxx.so.3 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-astropy \
python311-matplotlib \
python311-numpy \
python311-scipy \
update-alternatives"

inherit rpm
