SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python311-psutil-5.9.5-1.1.aarch64.rpm"
RPM_HASH = "0816e2e370cb3ae5e77ceb0f707f58e786b74c7e1eba4b4d2b08127ef0406a7f3f3f30b7ba7b3ba3f707884da6afa35dad8382f971942c5434bdb0d610bc154b"

RPROVIDES:${PN} += "python3.11dist(psutil) \
python311-psutil \
python311-psutil(aarch-64) \
python3dist(psutil)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
procps \
python(abi)"

inherit rpm
