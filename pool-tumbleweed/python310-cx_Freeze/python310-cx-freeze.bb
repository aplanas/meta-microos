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

RPM_NAME = "python310-cx_Freeze-6.14.9-1.3.aarch64.rpm"
RPM_HASH = "4305b8110f5676d0f5db8a35d5c152c5876fd219e6368e55c1dfe4eab286874b21940b47fffed4d2f718b802f9d514b4fc6a39abb5cf07789034e3523175771f"

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
