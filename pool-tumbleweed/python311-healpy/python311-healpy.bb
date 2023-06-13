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

RPM_NAME = "python311-healpy-1.16.2-1.1.aarch64.rpm"
RPM_HASH = "2e7daebec5d107f49f4f42a8dbaa39a9ba46bf78a1560f99cf27c99bf024baeeb79bf379b86985581fbb2b1b5c8946412d6e205e2b01ff0d77bd22ea991f7765"

RPROVIDES:${PN} += "python3.11dist(healpy) \
python311-healpy \
python311-healpy(aarch-64) \
python3dist(healpy)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhealpix_cxx.so.3()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-astropy \
python311-matplotlib \
python311-numpy \
python311-scipy \
update-alternatives"

inherit rpm
