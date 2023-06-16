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

RPM_NAME = "python39-cx_Freeze-6.14.9-1.1.aarch64.rpm"
RPM_HASH = "6a039b756c921391c0e1ad2dc11c803f717cddcb2d844bc9a61a985562716d7a81472271a3c1ba81cc594077d496b68edecd70a1ee04c8706807c4121e7eed24"

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
