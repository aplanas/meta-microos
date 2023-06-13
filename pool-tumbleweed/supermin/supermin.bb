SUMMARY = "Bootstrapping tool for creating supermin appliances"
DESCRIPTION = "supermin is a tool for building supermin appliances. These are tiny \
appliances (similar to virtual machines), usually around 100KB in size, \
which get fully instantiated on-the-fly in a fraction of a second when \
you need to boot one of them."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.2"

RPM_NAME = "supermin-5.2.2-4.3.aarch64.rpm"
RPM_HASH = "52f08b42e602ecc7ba5bccff9133695e12a0cc260197800d812a1d00591811ab6ca29587743fb97228955369e759f68d049c42963a9448ffd3a7cb6ddb23e300"

RPROVIDES:${PN} += "febootstrap \
supermin \
supermin(aarch-64)"

RDEPENDS:${PN} += "distribution-release \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libext2fs.so.2()(64bit) \
libm.so.6()(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
tar \
xmlstarlet \
zypper"

inherit rpm
