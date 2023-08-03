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

RPM_NAME = "python310-cx_Freeze-6.15.4-1.1.aarch64.rpm"
RPM_HASH = "0ff3d6a20c9ffaceb665aefd08b23a386d76cd4f9324db9ac02977cdedcb37f4363547d0394592de90a3196097f7fa394378965b3672b16642bec1bbb82adaf1"

RPROVIDES:${PN} += "python3.10dist-cx-freeze \
python310-cx-Freeze \
python3dist-cx-freeze"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python-abi \
update-alternatives"

inherit rpm
