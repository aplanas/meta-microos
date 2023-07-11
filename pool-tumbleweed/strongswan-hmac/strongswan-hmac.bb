SUMMARY = "Config file to disable non FIPS-140-2 algos in strongSwan"
DESCRIPTION = "The package provides a config file disabling alternative algorithm \
implementation when FIPS-140-2 compliant operation mode is enabled."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.11"

RPM_NAME = "strongswan-hmac-5.9.11-2.1.aarch64.rpm"
RPM_HASH = "451a2d9ca4c500656d2b8c9383cd1883b9077e4f216cdd31ca9b0a1f1e495dc94879174a834313e024ce27dba78a01c969fd92b61a04b81983e0dae7c912368a"

RPROVIDES:${PN} += "config-strongswan-hmac \
strongswan-hmac"

RDEPENDS:${PN} += "strongswan-ipsec \
strongswan-libs0"

inherit rpm
