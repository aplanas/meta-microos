SUMMARY = "Default containers policy.json"
DESCRIPTION = "This package ships the default /etc/containers/policy.json"
LICENSE = "Apache-2.0"

PV = "20230814"

RPM_NAME = "libcontainers-default-policy-20230814-1.1.noarch.rpm"
RPM_HASH = "578323c5702acd277b07b17363c8522b2595d90144aafb9cd74e3678ce8ae9645723719b65f9079114f09c88975208490e64e1f5c656f0e5c20a7fef4c99cadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-default-policy \
libcontainers-default-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
