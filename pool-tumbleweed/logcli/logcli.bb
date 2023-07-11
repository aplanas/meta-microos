SUMMARY = "LogCLI tool"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the LogCLI command-line tool."
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "logcli-2.8.0+git.1680557182.90888a0c-1.3.aarch64.rpm"
RPM_HASH = "bb2003bc53918b041f02e994adad00502cbf431a4a1df8f67073837a682c550c4995f59b7caa6a57181d1e6835b8f1a2298ee3e99e7e15b9d34aa3ac2bdf5189"

RPROVIDES:${PN} += "logcli"

RDEPENDS:${PN} += ""

inherit rpm
