SUMMARY = "A RADIUS client library"
DESCRIPTION = "The radcli library is a library for writing RADIUS Clients. The library's \
approach is to allow writing RADIUS-aware application in less than 50 lines \
of C code. It was based originally on freeradius-client and is source compatible \
with it."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "radcli-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "909eb86a3ae600396bfa0cc4e0d36110f724d8b98d7e18ef8efa4d8b633f7d5f3d58455c1ca5b1ec9c7116f8b20b03fca82a272fea1c97e5fcc51f2be36d4fe1"

RPROVIDES:${PN} += "config(radcli) \
radcli \
radcli(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
