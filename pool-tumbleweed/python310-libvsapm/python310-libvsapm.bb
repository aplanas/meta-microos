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

RPM_NAME = "python310-libvsapm-20230506-1.1.aarch64.rpm"
RPM_HASH = "88f877b7eab7ecad8177d56a09c26f6e55f74baebf0b990b30ed00654677fb45cd2b433f52fbdfffb4f3e064dab864e6fea64d1b8a0330014b516edc731b31db"

RPROVIDES:${PN} += "python310-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm
