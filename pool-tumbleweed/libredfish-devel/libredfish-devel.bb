SUMMARY = "Headers for building apps that use libredfish"
DESCRIPTION = "This package contains headers required to build applications that use libredfish."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1+git.74758f1"

RPM_NAME = "libredfish-devel-1.3.7.1+git.74758f1-1.1.aarch64.rpm"
RPM_HASH = "c74672e7fffd2d8cb12dfeed1dc900c5c7678a59a8ac20caa79e2632d521ef90a9416b92a51bd74eb7747882311236b546d637876cbc56c92474cc931d7bc9df"

RPROVIDES:${PN} += "libredfish-devel"

RDEPENDS:${PN} += "libredfish1"

inherit rpm
