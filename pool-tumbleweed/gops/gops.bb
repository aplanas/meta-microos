SUMMARY = "A tool to list and diagnose Go processes currently running on your system"
DESCRIPTION = "gops is a command to list and diagnose Go processes currently running on your \
system. For processes that starts the diagnostics agent, gops can report \
additional information such as the current stack trace, Go version, memory stats, \
etc. It is possible to use gops tool both in local and remote mode."
LICENSE = "BSD-3-Clause-Clear"

PV = "0.3.25"

RPM_NAME = "gops-0.3.25-1.7.aarch64.rpm"
RPM_HASH = "3207fa3f9120a4722664f4e3ae3fb4a70f83d457a8b79008c28d759de1474f7ac6c0ac50b0fd7d8adb0b1e148a8a1f27d29ef13fe9c91a679dcae5c33ead0440"

RPROVIDES:${PN} += "gops"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
