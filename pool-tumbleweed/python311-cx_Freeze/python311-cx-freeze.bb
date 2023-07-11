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

RPM_NAME = "python311-cx_Freeze-6.14.9-1.3.aarch64.rpm"
RPM_HASH = "6547938695cf57d3650d465dd520ac779da44f9207d85359dbbffb46536d6de247e724af98ffae7dd7d99e567654dc66e525e43574cfb0d4f883b611f596b2c9"

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
