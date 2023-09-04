SUMMARY = "KIWI - Core host system dependencies"
DESCRIPTION = "This metapackage installs the necessary system dependencies \
to run KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-core-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "7d8775ebf47cb788101ba4b640856b94d5d6e6051465548a36012334f74ce94a84733be025c454718b1fc1e22f643adaac18e0f0a0411dfce0ff0e8d6c16ff41"

RPROVIDES:${PN} += "kiwi-image-tbz \
kiwi-image-tbz-requires \
kiwi-packagemanager-dnf \
kiwi-packagemanager-dnf4 \
kiwi-packagemanager-microdnf \
kiwi-packagemanager-yum \
kiwi-packagemanager-zypper \
kiwi-systemdeps-core"

RDEPENDS:${PN} += "cpio \
dnf \
kiwi-tools \
lsof \
microdnf \
mtools \
openssl \
rsync \
tar \
zypper"

inherit rpm
