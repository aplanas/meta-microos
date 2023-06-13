SUMMARY = "Registry server following OCI Distribution Specification"
DESCRIPTION = "Registry server for Docker (hosting/delivering of repositories and images)."
LICENSE = "Apache-2.0"

PV = "2.8.2"

RPM_NAME = "distribution-registry-2.8.2-1.1.aarch64.rpm"
RPM_HASH = "9f06b8c3a2c8d137c12d177dcd84f7b9847313e5ae0c747330ba12b3529fb4f0339b601284fdf7bd548f6d2b0895bdfaf5569e5a0c14280ba5863cb6dbf51aec"

RPROVIDES:${PN} += "config(distribution-registry) \
distribution-registry \
distribution-registry(aarch-64) \
docker-distribution-registry \
group(registry) \
user(registry)"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/nologin \
libc.so.6()(64bit) \
sysuser-shadow"

inherit rpm
