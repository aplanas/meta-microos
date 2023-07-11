SUMMARY = "Registry server following OCI Distribution Specification"
DESCRIPTION = "Registry server for Docker (hosting/delivering of repositories and images)."
LICENSE = "Apache-2.0"

PV = "2.8.2"

RPM_NAME = "distribution-registry-2.8.2-1.2.aarch64.rpm"
RPM_HASH = "0a9b6507dae1399043284138903f11cfbc35edeb72879a80ca98cac2156a2ef8dcd58199334c22b47f847f645cf3030d9a4384de1ccb314005a5931d0b4352b3"

RPROVIDES:${PN} += "config-distribution-registry \
distribution-registry \
docker-distribution-registry \
group-registry \
user-registry"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/nologin \
libc.so.6 \
sysuser-shadow"

inherit rpm
