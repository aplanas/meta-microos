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

RPM_NAME = "python39-cx_Freeze-6.14.9-1.3.aarch64.rpm"
RPM_HASH = "2396517f3823db5c2b2c66f02f815030e992b9ea04e305deb8ac06e6dadad9a3864fc42b91acd12bb7cf84a48e24ea462d69518acbd00e74f184771982583290"

RPROVIDES:${PN} += "python3.9dist-cx-freeze \
python39-cx-Freeze \
python3dist-cx-freeze"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.9.so.1.0 \
python-abi \
update-alternatives"

inherit rpm
