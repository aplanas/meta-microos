SUMMARY = "LSC Algorithm Burst Library"
DESCRIPTION = "The LSC Algorithm Burst Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "python310-lalburst-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "cdc195b47f25138fb8ee986102574e8e367d01737ef37e7c37e86516ca404b550a5a85f4c4fbb4bed0735a127b34bfd00e8ed73dbbb338e2235682a5b6533183"

RPROVIDES:${PN} += "python3-lalburst \
python310-lalburst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.25 \
liblal.so.20 \
liblalburst.so.6 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python310-glue \
python310-lal \
python310-lalmetaio \
python310-lalsimulation \
python310-ligo-lw \
python310-numpy \
python310-scipy"

inherit rpm
