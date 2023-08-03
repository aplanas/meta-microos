SUMMARY = "Convenience package for a single-instance setup using nginx proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-single-instance-nginx-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "44a224704765f9454e5d4e08789bcd7257d46a741e62cdde098067ed6f27371eac275213dc7b117aedf82dc3e03f7d34a1dd657a8a9bed6c7d5aa76fe4fc08e7"

RPROVIDES:${PN} += "openQA-single-instance-nginx"

RDEPENDS:${PN} += "nginx \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
