SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.3.0"

RPM_NAME = "teleport-tctl-13.3.0-1.1.aarch64.rpm"
RPM_HASH = "ece339de3eb04003e6e94b6fd9080c42c0daf044b6daeb79ef6f9fb391766793c41726ca5add2202346ef2520a3ac38b496c95498d0936f04bd16c615a0d4477"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
