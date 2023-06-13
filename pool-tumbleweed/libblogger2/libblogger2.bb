SUMMARY = "FIFO interface used by startproc"
DESCRIPTION = "The libaray for the FIFO interface used by the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.26"

RPM_NAME = "libblogger2-2.26-2.2.aarch64.rpm"
RPM_HASH = "c3033d60137c33595df42b9d441d9d83d5624027a697f0ca6701c3e52ed82764caef4028f62a843768231c1c97f294ad97e5fa84ec2b54efdd63e482dcfe7fe4"

RPROVIDES:${PN} += "blog:/usr/lib64/libblogger.so.2 \
libblogger.so.2()(64bit) \
libblogger2 \
libblogger2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
