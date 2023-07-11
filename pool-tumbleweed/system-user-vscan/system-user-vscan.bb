SUMMARY = "System user vscan"
DESCRIPTION = "This package provides the system user 'vscan'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-vscan-20170617-24.16.noarch.rpm"
RPM_HASH = "65e0f419188ed350e5ddf56f23fbead3421e56ebab8d82c5c58154aedb7d84654342e54d3c1f8414266c699914cb184daa658eab0cee56de101f76632684ee8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-vscan \
system-user-vscan \
user-vscan"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
