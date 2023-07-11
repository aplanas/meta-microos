SUMMARY = "Jsonnet implementation in pure Go"
DESCRIPTION = "Feature complete, production-ready implementation of Jsonnet. It is compatible with the original \
Jsonnet C++ implementation."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "golang-github-google-jsonnet-0.20.0-1.2.aarch64.rpm"
RPM_HASH = "570f131d1ad65bfde12945cb5285a1d03b98fa0921e6707c3c40303b6c86b64b0910eadef53fb470fc77336c12ec8544ae381ff2116e85a97703b24ee605aebd"

RPROVIDES:${PN} += "golang-github-google-jsonnet \
jsonnet"

RDEPENDS:${PN} += ""

inherit rpm
