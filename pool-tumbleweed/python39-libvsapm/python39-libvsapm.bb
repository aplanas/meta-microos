SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries. \
 \
The Apple Partition Map (APM) is used on Motorola based Macintosh computers. On Intel based Macintosh computers the GUID Partition Table (GPT) is used. \
 \
The APM is supported by: \
    Apple Unix (A/UX) \
    Mac OS \
    Mac OS X \
 \
The APM consists of: \
    the drive descriptor \
    partition map entry of type Apple_partition_map \
    zero partition map entries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230506"

RPM_NAME = "python39-libvsapm-20230506-1.1.aarch64.rpm"
RPM_HASH = "629ab86e426b5e29ed7d3eb153af1e5e37d1450096414903562ade3bf5fc0a73b16e2e9c66b1db6d72efb23ad4cb68b1999b7510b60026a62588d1cdf5ef0907"

RPROVIDES:${PN} += "python39-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm
