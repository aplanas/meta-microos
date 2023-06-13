SUMMARY = "Scripts to create standalone executables from Python scripts"
DESCRIPTION = "CX_Freeze is a set of scripts and modules for turning Python scripts \
into executables in much the same way that py2exe and py2app do. \
 \
It works by bundling Python executables and libraries from the local \
Python installation. As such, the distribution produced by CX_Freeze \
shares the very same dependencies. System libraries are not bundled \
however, so additional dependencies may need to be manually installed \
before being able to run 'cx-frozen' executables that were created by \
other systems."
LICENSE = "Python-2.0"

PV = "6.14.9"

RPM_NAME = "python311-cx_Freeze-6.14.9-1.1.aarch64.rpm"
RPM_HASH = "dd3a8e148c4c1fb04ba39a0c41f96a7da03b645ed41ec0c8fa376bc28178240be787eb1738be3f19d6cf52e05e764bb045646e95cc3283e23d7f1941cc148406"

RPROVIDES:${PN} += "python3.11dist(cx-freeze) \
python311-cx_Freeze \
python311-cx_Freeze(aarch-64) \
python3dist(cx-freeze)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpython3.11.so.1.0()(64bit) \
python(abi) \
update-alternatives"

inherit rpm
