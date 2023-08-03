SUMMARY = "LogCLI tool"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the LogCLI command-line tool."
LICENSE = "Apache-2.0"

PV = "2.8.3+git.1689949088.0d81144c"

RPM_NAME = "logcli-2.8.3+git.1689949088.0d81144c-1.1.aarch64.rpm"
RPM_HASH = "8fda8d2fe98c336e778b3d18d0d55e9b9db8a0d6dce3e3a5fd73f20f293811af5d4cd67a94525700c88c05ed327b40d62180c34315a36467d1cdbcdfba7fd4dc"

RPROVIDES:${PN} += "logcli"

RDEPENDS:${PN} += ""

inherit rpm
