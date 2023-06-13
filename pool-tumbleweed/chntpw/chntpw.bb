SUMMARY = "Offline NT Password and Registry Editor"
DESCRIPTION = "A utility to reset the password of any user that has a valid local account on your Windows system. \
Supports all Windows from NT3.5 to Win8.1, also 64 bit and also the Server versions (like 2003, 2008, 2012) \
You do not need to know the old password to set a new one. \
It works offline, that is, you have to shutdown your computer and boot off a CD or USB disk to do the password reset. \
Will detect and offer to unlock locked or disabled out user accounts. \
There is also a registry editor and other registry utilities that works under linux/unix, and can be used for other things than password editing."
LICENSE = "GPL-2.0 & LGPL-2.1"

PV = "1.0"

RPM_NAME = "chntpw-1.0-1.22.aarch64.rpm"
RPM_HASH = "d049651d653a0e3a03cac5fb81d51c0e9115d6dc8b63c1f8a7499da95fdbf725edb4f8ed0ff84a69d18e8c30df95c7d526de73513cceac192a56795804625295"

RPROVIDES:${PN} += "chntpw \
chntpw(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
