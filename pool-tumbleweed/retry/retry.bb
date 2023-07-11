SUMMARY = "A simple tool for retrying command executions in plain POSIX sh"
DESCRIPTION = "A simple tool for retrying command executions in plain POSIX sh."
LICENSE = "MIT"

PV = "1687953576.0230dc5"

RPM_NAME = "retry-1687953576.0230dc5-1.1.noarch.rpm"
RPM_HASH = "c0143998fec1070cbd5a37de9810be604459e4564b2c449f13c20eceb9d64ec3660f2c9a9cc396b0bfaaa70e45dc73e1d186a02733956bf4f78fc621aad45eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "retry"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
