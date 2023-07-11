SUMMARY = "Offline NT Password and Registry Editor"
DESCRIPTION = "A utility to reset the password of any user that has a valid local account on your Windows system. \
Supports all Windows from NT3.5 to Win8.1, also 64 bit and also the Server versions (like 2003, 2008, 2012) \
You do not need to know the old password to set a new one. \
It works offline, that is, you have to shutdown your computer and boot off a CD or USB disk to do the password reset. \
Will detect and offer to unlock locked or disabled out user accounts. \
There is also a registry editor and other registry utilities that works under linux/unix, and can be used for other things than password editing."
LICENSE = "GPL-2.0 & LGPL-2.1"

PV = "1.0"

RPM_NAME = "chntpw-1.0-1.23.aarch64.rpm"
RPM_HASH = "55e67bf4d778cdd55a8b9c8c6e9337b836a726d0391631dd4828a618bfa1d6ba033f375bbf77fab1b9aa071f6e5b14b3c2c5e535615a5e0d951b1b4b54e48c3f"

RPROVIDES:${PN} += "chntpw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
