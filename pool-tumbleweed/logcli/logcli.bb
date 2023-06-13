SUMMARY = "LogCLI tool"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the LogCLI command-line tool."
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "logcli-2.8.0+git.1680557182.90888a0c-1.2.aarch64.rpm"
RPM_HASH = "13160dd89589e5e82a2b9b97e9d0fa63d8596b3e865d5c43a8edabb1dfb39783482ffd5aaec8706e8e4cebe9ea943be2ccc8b19633864045129d5b8c31fd5e5e"

RPROVIDES:${PN} += "logcli \
logcli(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
