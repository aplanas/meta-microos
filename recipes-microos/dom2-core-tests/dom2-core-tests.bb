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

RPM_NAME = "dom2-core-tests-0.0.1-30.16.noarch.rpm"
RPM_HASH = "c5db350d579870f73bbfa8e2c87c29eda2a122aa5a8b3a6ca20f69105bf7118fbc86bf43749848ee7b5b305c9ea10ebf43b0f3fcbf57e052839698fa540832e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom2-core-tests"
RDEPENDS:${PN} += ""

inherit rpm
