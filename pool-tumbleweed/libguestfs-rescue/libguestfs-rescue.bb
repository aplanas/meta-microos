SUMMARY = "Virt-rescue shell"
DESCRIPTION = "This adds the virt-rescue shell which is a 'rescue disk' for virtual \
machines, and additional tools to use inside the shell such as ssh, \
network utilities, editors and debugging utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rescue-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "5e8a83c6ad1fd9b73a085a931002cb77e0aa1ec5afa642fcca64247133c6490da378e7f80b0d58ebdb9499b97d74050c38f5b30c6e7ae6adb5b72c4ecc497eae"

RPROVIDES:${PN} += "libguestfs-rescue \
libguestfs-rescue(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libconfig.so.11()(64bit) \
libguestfs.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
