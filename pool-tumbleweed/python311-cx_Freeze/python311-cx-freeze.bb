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

PV = "6.15.4"

RPM_NAME = "python311-cx_Freeze-6.15.4-1.1.aarch64.rpm"
RPM_HASH = "3d6948e03e7a723ef9434deb64b266ccd6293c07e4ed23317f8d55fedd18ab2d1c10d40b87e3676b91ade51daf8dab7b2d464526fda190ba7784c28beaf3ca4f"

RPROVIDES:${PN} += "python3-cx-Freeze \
python3.11dist-cx-freeze \
python311-cx-Freeze \
python3dist-cx-freeze"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
update-alternatives"

inherit rpm
