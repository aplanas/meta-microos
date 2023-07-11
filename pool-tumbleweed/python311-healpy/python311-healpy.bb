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

PV = "1.16.2"

RPM_NAME = "python311-healpy-1.16.2-1.3.aarch64.rpm"
RPM_HASH = "e979aa95f85f1490ab6cc3ab17ac58c7bbc9d338044f60f68b79ab7c09bc6275a3504165fe3e7bc44361131b59828ee6a812d22285ef5dc658c0e5f4349c5822"

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
