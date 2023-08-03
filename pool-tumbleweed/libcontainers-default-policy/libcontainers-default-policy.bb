SUMMARY = "Default containers policy.json"
DESCRIPTION = "This package ships the default /etc/containers/policy.json"
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-default-policy-20230214-8.1.noarch.rpm"
RPM_HASH = "2b9101d31394c77658b62087cb5201f29258bcc85933a3aa8b1bc638ce593d276377d8ce4e19099742beff2ea5eae165d4140a845da7b1ba6798c46e337836bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-default-policy \
libcontainers-default-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
