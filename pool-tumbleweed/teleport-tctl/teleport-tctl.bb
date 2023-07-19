SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.2.1"

RPM_NAME = "teleport-tctl-13.2.1-1.1.aarch64.rpm"
RPM_HASH = "955b85026cf280a6e085ce70e4c89c8d381b39f51ce7682248083d2c7ef4de43da209d9539b7bd6a6f28a8b10cd0905d5cf42ea3f582b96737ffd733f33bef3e"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
