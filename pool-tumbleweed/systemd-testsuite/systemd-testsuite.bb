SUMMARY = "Testsuite for systemd"
DESCRIPTION = "This package contains the unit tests as well as the extended testsuite. The unit \
tests are used to check various internal functions used by systemd whereas the \
extended testsuite is used to test various functionalities of systemd and all \
its components. \
 \
Note that you need root privileges to run the extended testsuite. \
 \
Run the following python script to run all unit tests at once: \
$ /usr/lib/systemd/tests/run-unit-tests.py \
 \
To run the full extended testsuite do the following: \
$ NO_BUILD=1 TEST_NESTED_VM=1 /usr/lib/systemd/tests/integration-tests/run-integration-tests.sh \
 \
Or to run one specific integration test: \
$ NO_BUILD=1 TEST_NESTED_VM=1 make -C /usr/lib/systemd/tests/integration-tests/TEST-01-BASIC clean setup run \
 \
For more details on the available options to run the extended testsuite, please \
refer to /usr/lib/systemd/tests/integration-tests/README.testsuite."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-testsuite-253.4-2.1.aarch64.rpm"
RPM_HASH = "ac6b45c2b6cf2982950a509ef1c9eec29879738c51ab2e90a259df790f4cd216225af029910d65c3ac718c14454674b38981811d2ac5ef1f7c2b78721da6d3ce"

RPROVIDES:${PN} += "systemd-testsuite"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/python3 \
attr \
binutils \
busybox-static \
cryptsetup \
dosfstools \
jq \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap-progs \
libcap.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libfido2 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libidn2 \
libkmod.so.2 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libmount.so.1 \
libpwquality1 \
libqrencode4 \
libseccomp.so.2 \
libselinux.so.1 \
libssl.so.3 \
libsystemd-core-253.so \
libsystemd-shared-253.so \
libsystemd.so.0 \
libtss2-esys0 \
libtss2-mu0 \
libtss2-rc0 \
libudev.so.1 \
libz.so.1 \
libzstd.so.1 \
lz4 \
make \
mtools \
netcat \
pkgconfig-libfido2 \
pkgconfig-libidn2 \
pkgconfig-libqrencode \
pkgconfig-pwquality \
pkgconfig-tss2-esys \
pkgconfig-tss2-mu \
pkgconfig-tss2-rc \
python3-pexpect \
qemu-kvm \
quota \
selinux-policy-devel \
socat \
squashfs \
systemd \
systemd-container \
systemd-coredump \
systemd-experimental \
systemd-journal-remote \
systemd-network \
systemd-portable \
xz"

inherit rpm
