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

RPM_NAME = "python310-cx_Freeze-6.14.9-1.1.aarch64.rpm"
RPM_HASH = "42ddb4e5b01b1fee06f12849eebbdfca1fee3b616d5febaf01adbe176332d2103847cfde7f2d15a127ee645b37b49982d9b6eb7b4c60346e9252767f6919f072"

RPROVIDES:${PN} += "python3-cx-Freeze \
python3.10dist-cx-freeze \
python310-cx-Freeze \
python3dist-cx-freeze"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python-abi \
update-alternatives"

inherit rpm
