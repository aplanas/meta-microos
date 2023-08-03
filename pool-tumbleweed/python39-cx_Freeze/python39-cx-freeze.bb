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

RPM_NAME = "python39-cx_Freeze-6.15.4-1.1.aarch64.rpm"
RPM_HASH = "d1860602b0440aaf8b92c1040b089756c03226b129f2b9b772be49f1a4b17819e8f8e0c655f6e66393cbb412db37ac7003e176adc1caa914e62019349776dac7"

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
