SUMMARY = "Small Footprint CIM Broker"
DESCRIPTION = "Small Footprint CIM Broker (sfcb) is a CIM server conforming to the CIM \
Operations over HTTP protocol. It is robust, with low resource \
consumption and therefore specifically suited for embedded and resource \
constrained environments. sfcb supports providers written against the \
Common Manageability Programming Interface (CMPI)."
LICENSE = "EPL-1.0"

PV = "1.4.9"

RPM_NAME = "sblim-sfcb-1.4.9-15.4.aarch64.rpm"
RPM_HASH = "a2e9605bae62c52a4e5cab08ddf5a25a180386561156cc4919421f6f3a1ddccd37cc6cc5e524f7c7ef99b32a158240d4bbedb21f2b94e2b034f020c222b08c3d"

RPROVIDES:${PN} += "cim-server \
cimserver \
config(sblim-sfcb) \
libcimcClientSfcbLocal.so.0()(64bit) \
libsfcBasicAuthentication.so.0()(64bit) \
libsfcBasicPAMAuthentication.so.0()(64bit) \
libsfcBrokerCore.so.0()(64bit) \
libsfcCertificateAuthentication.so.0()(64bit) \
libsfcCimXmlCodec.so.0()(64bit) \
libsfcClassProvider.so.0()(64bit) \
libsfcClassProviderGz.so.0()(64bit) \
libsfcClassProviderMem.so.0()(64bit) \
libsfcClassProviderSf.so.0()(64bit) \
libsfcCustomLib.so.0()(64bit) \
libsfcElementCapabilitiesProvider.so.0()(64bit) \
libsfcFileRepository.so.0()(64bit) \
libsfcHttpAdapter.so.0()(64bit) \
libsfcIndCIMXMLHandler.so.0()(64bit) \
libsfcInternalProvider.so.0()(64bit) \
libsfcInteropProvider.so.0()(64bit) \
libsfcInteropServerProvider.so.0()(64bit) \
libsfcObjectImplSwapI32toP32.so.0()(64bit) \
libsfcProfileProvider.so.0()(64bit) \
libsfcQualifierProvider.so.0()(64bit) \
sblim-sfcb \
sblim-sfcb(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/sbin/groupadd \
/usr/sbin/groupmod \
aaa_base \
cim-schema \
cmpi-provider-register \
curl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libsfcUtil.so.0()(64bit) \
libsfcUtil.so.0(SFCUTIL_1.0)(64bit) \
libsfcUtil.so.0(SFCUTIL_1.1)(64bit) \
libslp.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit) \
openssl \
pam"

inherit rpm
