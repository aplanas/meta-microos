SUMMARY = "DOM Conformance Test Suite"
DESCRIPTION = "The DOM Test Suites (DOM TS) will consist of a number of tests for each \
level of the DOM specification. The tests will be represented in an XML \
grammar which ensures that tests can easily be ported from the \
description format to a number of specific language bindings. This \
grammar will be specified in XML Schema and DTD form. The grammar will \
be automatically generated from the DOM specifications themselves, to \
ensure stability and correctness."
LICENSE = "W3C"

PV = "0.0.1"

RPM_NAME = "dom2-core-tests-0.0.1-30.17.noarch.rpm"
RPM_HASH = "676123b8331551d24df2419a17a5aeff3dde281b89650a8ad81f6b8e94a61c196490b67787b497ce155d331c84ab717eaebbfcb41f30c149df0fbcd703c11e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom2-core-tests"

RDEPENDS:${PN} += ""

inherit rpm
