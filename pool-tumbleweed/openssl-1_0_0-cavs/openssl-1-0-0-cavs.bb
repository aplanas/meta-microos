SUMMARY = "CAVS testing framework and utilities"
DESCRIPTION = "Includes the Composite Application Validation System (CAVS) \
testing framework and utilities."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-cavs-1.0.2u-21.1.aarch64.rpm"
RPM_HASH = "17c9a7e272a6c6c4f5cb67970663b8a130f72f9cb804c910e94ee39c4b197addffdf797d306aebef02815716bbed53ec61bbf2f114c0d6377e0893af244fac4e"

RPROVIDES:${PN} += "openssl-1-0-0-cavs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libopenssl1-0-0 \
libz.so.1"

inherit rpm
