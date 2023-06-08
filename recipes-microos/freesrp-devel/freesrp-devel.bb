SUMMARY = "Development files for libfreesrp"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libfreesrp."
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "freesrp-devel-0.3.0-1.27.aarch64.rpm"
RPM_HASH = "4d7e426e164048add5f5ef8c1165106dcdb65ecdaf668985a44f529f0c01bca2a500d11c1df937c1917739a9d147f22d468f12e5b6b7ce48e94ec0249a85a768"

RPROVIDES:${PN} += "freesrp-devel freesrp-devel(aarch-64)"
RDEPENDS:${PN} += "libfreesrp0"

inherit rpm
