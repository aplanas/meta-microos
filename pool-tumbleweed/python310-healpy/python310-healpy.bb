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

RPM_NAME = "python310-healpy-1.16.2-1.3.aarch64.rpm"
RPM_HASH = "e14e8b653537deefb987247ca361f9edbfbe9e686706c71e91207ae00d2f7ffc3d5d6cf7409afa1459d0faf024f0b5105254df18602337dd3cb28695d5d5f163"

RPROVIDES:${PN} += "python3.10dist-healpy \
python310-healpy \
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
python310-astropy \
python310-matplotlib \
python310-numpy \
python310-scipy \
update-alternatives"

inherit rpm
