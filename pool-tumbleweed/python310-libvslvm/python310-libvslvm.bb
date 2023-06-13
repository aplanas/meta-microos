SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libvslvm-20221025-3.7.aarch64.rpm"
RPM_HASH = "0d6b7ad435e40a2a2c3538c3c3e523dbe5edcc18fa559218f5011d75c262a78b1894a59830ab9bdca76f664dac80ee7e885061d0330175d3b3342736cea944cd"

RPROVIDES:${PN} += "python3-libvslvm \
python310-libvslvm \
python310-libvslvm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libvslvm.so.1()(64bit) \
libvslvm.so.1(V_20221025)(64bit) \
python(abi)"

inherit rpm
