SUMMARY = "CLI tool for linting and testing Helm charts"
DESCRIPTION = "ct is the the tool for testing Helm charts. It is meant to be used for linting and testing pull requests. It automatically detects charts changed against the target branch."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "chart-testing-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "4e2e1941be26927e0ed916a6547908a1090df9d4daa20e6eec4a7ff53e6465a2fbe54d847a9bf333629cc15ec731e1699ee895f776aed973ab3a6119038e44a1"

RPROVIDES:${PN} += "chart-testing chart-testing(aarch-64)"
RDEPENDS:${PN} += "git-core helm libc.so.6(GLIBC_2.34)(64bit) python3-yamale python3-yamllint"

inherit rpm
