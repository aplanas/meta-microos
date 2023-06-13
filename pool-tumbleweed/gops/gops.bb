SUMMARY = "A tool to list and diagnose Go processes currently running on your system"
DESCRIPTION = "gops is a command to list and diagnose Go processes currently running on your \
system. For processes that starts the diagnostics agent, gops can report \
additional information such as the current stack trace, Go version, memory stats, \
etc. It is possible to use gops tool both in local and remote mode."
LICENSE = "BSD-3-Clause-Clear"

PV = "0.3.25"

RPM_NAME = "gops-0.3.25-1.6.aarch64.rpm"
RPM_HASH = "e69f4b2f5e5bb609a7b8bc0e0e6ede3ddf0afdf188ff7e9ae90cd27ca5156ef8a1dc665a9f26c42bfbfdb15f5180c98dae6d3c85854d312df623f0b62c9e898c"

RPROVIDES:${PN} += "gops \
gops(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
