SUMMARY = "Rime's configuration manager"
DESCRIPTION = "Plum is rime's configuration manager."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-plum-20230603+git.5fdd2d6-1.1.aarch64.rpm"
RPM_HASH = "78ed4e7f90e2f9ca86de796a8d178f195d0da0d9e9012c2488bb04ac080ed5ab31fb3c2e6822de3474ce406e0823ef8d593f8ba25355b3e7613d6e9560926942"

RPROVIDES:${PN} += "rime-plum \
rime-plum(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
