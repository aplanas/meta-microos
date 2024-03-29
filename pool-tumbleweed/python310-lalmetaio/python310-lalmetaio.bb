SUMMARY = "LSC Algorithm MetaIO Library"
DESCRIPTION = "The LSC Algorithm MetaIO Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "python310-lalmetaio-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "1ff152c5e3ba4df99cf2359371b1ab3135f22ad5d17d9ea8d90709cce4a460bd0b358ab934a7878634c0a083160e07b5820dbaa137d3173a3ff655c912c1d1e5"

RPROVIDES:${PN} += "python3-lalmetaio \
python310-lalmetaio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalmetaio.so.10 \
liblalsupport.so.14 \
python-abi \
python310-lal \
python310-numpy"

inherit rpm
