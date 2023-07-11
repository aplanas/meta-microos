SUMMARY = "A statistics and machine learning toolbox"
DESCRIPTION = "A statistics and machine learning toolbox for data with and w/o missing values. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "octave-forge-nan-3.7.0-1.7.aarch64.rpm"
RPM_HASH = "9993e3b8ec63020879bdb5449dc0e35baa8f6dc85dce598cde98965d29348d118a353f4872a1593e55c11dc1c505641d1fd14c0aea250c14873f9cae5ab9753b"

RPROVIDES:${PN} += "octave-forge-nan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-cli"

inherit rpm
