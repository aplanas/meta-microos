SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.6.2"

RPM_NAME = "python310-PyInstaller-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "0e4f5ea045366395d48f76b2a346d89d624ee91f2c0467b6274987a85c551de07f8bd40f1a718476e17f481eccc7cd4a27935585e7f7e827675e026e174ced51"

RPROVIDES:${PN} += "python3-PyInstaller \
python3.10dist(pyinstaller) \
python310-PyInstaller \
python310-PyInstaller(aarch-64) \
python3dist(pyinstaller)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
python(abi) \
python310-devel \
python310-macholib \
python310-pefile \
python310-setuptools \
update-alternatives"

inherit rpm
