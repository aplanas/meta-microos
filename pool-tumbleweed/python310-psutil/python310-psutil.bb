SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python310-psutil-5.9.5-1.1.aarch64.rpm"
RPM_HASH = "f871387683f1c0ade97a621a5b0a6ca9d9f04b5aa9be8588118d556506e72d1e18e5298f19b7ee353d8e801eef455183e8893157b2b4ad19554767504e63ec0f"

RPROVIDES:${PN} += "python3-psutil \
python3.10dist(psutil) \
python310-psutil \
python310-psutil(aarch-64) \
python3dist(psutil)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
procps \
python(abi)"

inherit rpm
