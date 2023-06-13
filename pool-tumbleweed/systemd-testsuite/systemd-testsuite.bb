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

RPROVIDES:${PN} += "systemd-testsuite \
systemd-testsuite(aarch-64)"

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
ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2_37)(64bit) \
libc.so.6()(64bit) \
libcap-progs \
libcap.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libfido2 \
libgcrypt.so.20()(64bit) \
libgpg-error.so.0()(64bit) \
libidn2 \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libmount.so.1()(64bit) \
libpwquality1 \
libqrencode4 \
libseccomp.so.2()(64bit) \
libselinux.so.1()(64bit) \
libssl.so.3()(64bit) \
libsystemd-core-253.so()(64bit) \
libsystemd-core-253.so(SD_SHARED)(64bit) \
libsystemd-shared-253.so()(64bit) \
libsystemd-shared-253.so(SD_SHARED)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_211)(64bit) \
libsystemd.so.0(LIBSYSTEMD_213)(64bit) \
libsystemd.so.0(LIBSYSTEMD_214)(64bit) \
libsystemd.so.0(LIBSYSTEMD_216)(64bit) \
libsystemd.so.0(LIBSYSTEMD_217)(64bit) \
libsystemd.so.0(LIBSYSTEMD_219)(64bit) \
libsystemd.so.0(LIBSYSTEMD_220)(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_226)(64bit) \
libsystemd.so.0(LIBSYSTEMD_227)(64bit) \
libsystemd.so.0(LIBSYSTEMD_229)(64bit) \
libsystemd.so.0(LIBSYSTEMD_230)(64bit) \
libsystemd.so.0(LIBSYSTEMD_231)(64bit) \
libsystemd.so.0(LIBSYSTEMD_232)(64bit) \
libsystemd.so.0(LIBSYSTEMD_233)(64bit) \
libsystemd.so.0(LIBSYSTEMD_234)(64bit) \
libsystemd.so.0(LIBSYSTEMD_236)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
libsystemd.so.0(LIBSYSTEMD_238)(64bit) \
libsystemd.so.0(LIBSYSTEMD_239)(64bit) \
libsystemd.so.0(LIBSYSTEMD_240)(64bit) \
libsystemd.so.0(LIBSYSTEMD_241)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libsystemd.so.0(LIBSYSTEMD_245)(64bit) \
libsystemd.so.0(LIBSYSTEMD_246)(64bit) \
libsystemd.so.0(LIBSYSTEMD_247)(64bit) \
libsystemd.so.0(LIBSYSTEMD_248)(64bit) \
libsystemd.so.0(LIBSYSTEMD_249)(64bit) \
libsystemd.so.0(LIBSYSTEMD_250)(64bit) \
libsystemd.so.0(LIBSYSTEMD_251)(64bit) \
libsystemd.so.0(LIBSYSTEMD_252)(64bit) \
libsystemd.so.0(LIBSYSTEMD_253)(64bit) \
libtss2-esys0 \
libtss2-mu0 \
libtss2-rc0 \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_189)(64bit) \
libudev.so.1(LIBUDEV_196)(64bit) \
libudev.so.1(LIBUDEV_199)(64bit) \
libudev.so.1(LIBUDEV_215)(64bit) \
libudev.so.1(LIBUDEV_247)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
lz4 \
make \
mtools \
netcat \
pkgconfig(libfido2) \
pkgconfig(libidn2) \
pkgconfig(libqrencode) \
pkgconfig(pwquality) \
pkgconfig(tss2-esys) \
pkgconfig(tss2-mu) \
pkgconfig(tss2-rc) \
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
