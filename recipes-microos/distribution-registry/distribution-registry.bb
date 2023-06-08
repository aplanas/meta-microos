SUMMARY = "Registry server following OCI Distribution Specification"
DESCRIPTION = "Registry server for Docker (hosting/delivering of repositories and images)."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "distribution-registry-2.8.1-4.3.aarch64.rpm"
RPM_HASH = "470a4e20db9936cb7e4874fdc440f3b9767b874c89d831f0bb9b44e6a8aa69dc354731d9ce8b2c8a4b059f5a45b6f35b5fd43f08e16fb334054892778b947d1b"

RPROVIDES:${PN} += "config(distribution-registry) distribution-registry distribution-registry(aarch-64) docker-distribution-registry group(registry) user(registry)"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/nologin libc.so.6(GLIBC_2.34)(64bit) sysuser-shadow"

inherit rpm
