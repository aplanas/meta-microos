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

RPM_NAME = "python311-libvsapm-20230506-1.1.aarch64.rpm"
RPM_HASH = "87e5a738862a2de61abe6e49a0992e0713ac6753e67f49794e0df95d17674374d1fe6774b628894566e49ece28767a096901cf655df4e41f41ea27018b99cfff"

RPROVIDES:${PN} += "python3-libvsapm \
python311-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm
