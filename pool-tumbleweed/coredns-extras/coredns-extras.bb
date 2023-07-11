SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "coredns-extras-1.10.0-1.5.noarch.rpm"
RPM_HASH = "f602a9742bd5961651cb0d98acb89cbb4943805b637f36724e75ebc44518fd311a6a1bb35885e6870e5d258dac5d8a7d641ed1ac5d0278ec11fb3efc7d4ca316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-extras \
coredns-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns"

inherit rpm
