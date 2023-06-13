SUMMARY = "Documentation for OpenStack concurrency library"
DESCRIPTION = "The oslo.concurrency library has utilities for safely running multi-thread, \
multi-process applications using locking mechanisms and for running \
external processes. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python-oslo.concurrency-doc-5.0.1-1.2.noarch.rpm"
RPM_HASH = "b5e48f6a3db22e5dd049dd17562678513e8e349f69b841df78905f52d5f7b92b8533d32d6630d2a3e29eda363bfe634bb8faa8095b41f1629d7eaa5973bd9fd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.concurrency-doc"

RDEPENDS:${PN} += ""

inherit rpm
