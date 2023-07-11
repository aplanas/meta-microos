SUMMARY = "KIWI - Core host system dependencies"
DESCRIPTION = "This metapackage installs the necessary system dependencies \
to run KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-core-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "47ed584e49ce9526cef91f05f334de89654b82844564944f4deffa978ec98f594cf4a3bae526e85abbbaaf796a859b7da8884a04ca440a82af3388062b384258"

RPROVIDES:${PN} += "kiwi-image-tbz \
kiwi-image-tbz-requires \
kiwi-packagemanager-dnf \
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
