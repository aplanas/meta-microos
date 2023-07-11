SUMMARY = "CLI tool for linting and testing Helm charts"
DESCRIPTION = "ct is the the tool for testing Helm charts. It is meant to be used for linting and testing pull requests. It automatically detects charts changed against the target branch."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "chart-testing-3.8.0-2.3.aarch64.rpm"
RPM_HASH = "a0f3a05d42831f4157e4fd9911f8ea6032053f9b83a862bb571450839001fb6a1276e405a47090f7e2055a0e9c91844f91cae53e1470d2d680b424c0463f6583"

RPROVIDES:${PN} += "chart-testing"

RDEPENDS:${PN} += "git-core \
helm \
libc.so.6 \
python3-yamale \
python3-yamllint"

inherit rpm
