SUMMARY = "A tool to list and diagnose Go processes currently running on your system"
DESCRIPTION = "gops is a command to list and diagnose Go processes currently running on your \
system. For processes that starts the diagnostics agent, gops can report \
additional information such as the current stack trace, Go version, memory stats, \
etc. It is possible to use gops tool both in local and remote mode."
LICENSE = "BSD-3-Clause-Clear"

PV = "0.3.27"

RPM_NAME = "gops-0.3.27-1.1.aarch64.rpm"
RPM_HASH = "58534efd1487acbd3ce4606e9abd63b380aa9356d279a8b89b9ebccadf711d7ab64bcde127c380abfeab2f3434a642240a82a05e839c57a54724a3a4e2e26b67"

RPROVIDES:${PN} += "gops"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
