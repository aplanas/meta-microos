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
config-sblim-sfcb \
libcimcClientSfcbLocal.so.0 \
libsfcBasicAuthentication.so.0 \
libsfcBasicPAMAuthentication.so.0 \
libsfcBrokerCore.so.0 \
libsfcCertificateAuthentication.so.0 \
libsfcCimXmlCodec.so.0 \
libsfcClassProvider.so.0 \
libsfcClassProviderGz.so.0 \
libsfcClassProviderMem.so.0 \
libsfcClassProviderSf.so.0 \
libsfcCustomLib.so.0 \
libsfcElementCapabilitiesProvider.so.0 \
libsfcFileRepository.so.0 \
libsfcHttpAdapter.so.0 \
libsfcIndCIMXMLHandler.so.0 \
libsfcInternalProvider.so.0 \
libsfcInteropProvider.so.0 \
libsfcInteropServerProvider.so.0 \
libsfcObjectImplSwapI32toP32.so.0 \
libsfcProfileProvider.so.0 \
libsfcQualifierProvider.so.0 \
sblim-sfcb"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/sbin/groupadd \
/usr/sbin/groupmod \
aaa-base \
cim-schema \
cmpi-provider-register \
curl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libpam.so.0 \
libsfcUtil.so.0 \
libslp.so.1 \
libssl.so.3 \
libz.so.1 \
openssl \
pam"

inherit rpm
