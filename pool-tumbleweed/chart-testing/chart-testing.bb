SUMMARY = "CLI tool for linting and testing Helm charts"
DESCRIPTION = "ct is the the tool for testing Helm charts. It is meant to be used for linting and testing pull requests. It automatically detects charts changed against the target branch."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "chart-testing-3.9.0-1.1.aarch64.rpm"
RPM_HASH = "0fbc09d1f7ef9155532b594202b3d76fe1cdf5d81c75d6f8adebb4b0b340d647b0c7dd034ff2b47400901ee932e1e85663bec37c07a12f564cac8fb7d228b5d0"

RPROVIDES:${PN} += "chart-testing"

RDEPENDS:${PN} += "git-core \
helm \
libc.so.6 \
python3-yamale \
python3-yamllint"

inherit rpm
