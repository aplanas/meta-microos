SUMMARY = "Small Footprint CIM Broker"
DESCRIPTION = "Small Footprint CIM Broker (sfcb) is a CIM server conforming to the CIM \
Operations over HTTP protocol. It is robust, with low resource \
consumption and therefore specifically suited for embedded and resource \
constrained environments. sfcb supports providers written against the \
Common Manageability Programming Interface (CMPI)."
LICENSE = "EPL-1.0"

PV = "1.4.9"

RPM_NAME = "sblim-sfcb-1.4.9-16.1.aarch64.rpm"
RPM_HASH = "2ea2400daf480fb26d295aa5402c5ffac2ebb68c50251fcc2a5a1ecfe92f7dfb1e9982908e2bc01a4035afc0b20c0f26336f0e1fb73730f2545504a2b2132037"

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
libsfcQualifierProvider.so.0 \
sblim-sfcb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
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
libssl.so.3 \
libz.so.1 \
openssl \
pam"

inherit rpm
