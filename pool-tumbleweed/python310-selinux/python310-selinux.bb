SUMMARY = "Python bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Python extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "python310-selinux-3.5-4.1.aarch64.rpm"
RPM_HASH = "ce2c665f1016150ff9983e27d38dc77e1d668f78bfd231efdc96ef2546436851f68d791d822a3c641cc2802e08526a653dc6d5bfac6428a045b1ddf41768bdc6"

RPROVIDES:${PN} += "python3.10dist-selinux \
python310-selinux \
python3dist-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libselinux1 \
python-abi"

inherit rpm
