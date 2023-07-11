SUMMARY = "SELinux Support"
DESCRIPTION = "This are packages which are required to enable SELinux on openSUSE MicroOS"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-selinux-5.0-72.1.aarch64.rpm"
RPM_HASH = "811ad6491af46b3481e0cf4a66fcc2b85440f95fe7f156678dbe193ecd24124a7a6607695020c6b5607ab34d1b86cff4af010c0635d50905eecb1699f36d2140"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-selinux"

RDEPENDS:${PN} += "container-selinux \
policycoreutils \
selinux-policy-targeted \
selinux-tools"

inherit rpm
