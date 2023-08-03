SUMMARY = "Development headers for the Intel TSS library for TPM 2.0 chips"
DESCRIPTION = "This package provides the development files for the tpm2 stack's libraries for \
accessing TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "tpm2-0-tss-devel-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "d4546352b98a55ca356870addc64deafbfe59114d3452f908eed6905f4391f0529e0c13a204c13221a56c4f6c383eec84515eefeb219b204fb1193a597cad9f2"

RPROVIDES:${PN} += "pkgconfig-tss2-esys \
pkgconfig-tss2-fapi \
pkgconfig-tss2-mu \
pkgconfig-tss2-policy \
pkgconfig-tss2-rc \
pkgconfig-tss2-sys \
pkgconfig-tss2-tcti-cmd \
pkgconfig-tss2-tcti-device \
pkgconfig-tss2-tcti-mssim \
pkgconfig-tss2-tcti-pcap \
pkgconfig-tss2-tcti-spi-helper \
pkgconfig-tss2-tcti-swtpm \
pkgconfig-tss2-tctildr \
tpm2-0-tss-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtss2-esys0 \
libtss2-fapi1 \
libtss2-mu0 \
libtss2-policy0 \
libtss2-rc0 \
libtss2-sys1 \
libtss2-tcti-cmd0 \
libtss2-tcti-device0 \
libtss2-tcti-mssim0 \
libtss2-tcti-pcap0 \
libtss2-tcti-spi-helper0 \
libtss2-tcti-swtpm0 \
libtss2-tctildr0 \
pkgconfig-json-c \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-tss2-esys \
pkgconfig-tss2-mu \
pkgconfig-tss2-sys \
pkgconfig-tss2-tctildr \
pkgconfig-uuid \
tpm2-0-tss"

inherit rpm
