SUMMARY = "Default containers policy.json"
DESCRIPTION = "This package ships the default /etc/containers/policy.json"
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-default-policy-20230214-7.1.noarch.rpm"
RPM_HASH = "600a0af063c902bac8fe3db23ee7ff9dad1cf4de25e5dac3b3a1b7589447fc7e8dc5b29f283d0c643c59f9355b9a0561df764a880e5f00f61002720f4ff0ee4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-default-policy \
libcontainers-default-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
