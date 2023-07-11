SUMMARY = "Documentation for OpenStack concurrency library"
DESCRIPTION = "The oslo.concurrency library has utilities for safely running multi-thread, \
multi-process applications using locking mechanisms and for running \
external processes. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python-oslo.concurrency-doc-5.0.1-1.3.noarch.rpm"
RPM_HASH = "7697872b1a2501b105df62809fbbd415ebce858ab0ff1ebae5715485444507ffeee81578f778c7be07ddb89535576a024ccc2b7a713df2e8f74f1f9371f3335c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.concurrency-doc"

RDEPENDS:${PN} += ""

inherit rpm
