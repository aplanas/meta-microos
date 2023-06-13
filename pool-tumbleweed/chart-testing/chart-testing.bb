SUMMARY = "CLI tool for linting and testing Helm charts"
DESCRIPTION = "ct is the the tool for testing Helm charts. It is meant to be used for linting and testing pull requests. It automatically detects charts changed against the target branch."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "chart-testing-3.8.0-2.2.aarch64.rpm"
RPM_HASH = "63314d5575aa61fa300d2e81248627d518b23c0e479865de758f82f8fab1847282201f97fbfacaf6af476c7846048a2c77598f317979e3a5371d2a8143b54c64"

RPROVIDES:${PN} += "chart-testing \
chart-testing(aarch-64)"

RDEPENDS:${PN} += "git-core \
helm \
libc.so.6()(64bit) \
python3-yamale \
python3-yamllint"

inherit rpm
