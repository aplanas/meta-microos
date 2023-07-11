SUMMARY = "Command line date and time utilities"
DESCRIPTION = "Dateutils are a bunch of tools that revolve around fiddling with dates \
and times in the command line with a strong focus on use cases that \
arise when dealing with large amounts of financial data. Their target \
market is shell scripts that need date calculations or calendar \
conversions, and as such they are highly pipe-able and modeled after \
their well-known cousins (e.g. dtest vs. test, or dgrep vs. grep)."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "dateutils-0.4.10-2.4.aarch64.rpm"
RPM_HASH = "3bcdc6dcdf788e9c8fcedc48fe31a6c7e78cbfa15f952699239b70c5a4d0b92d23958d5aeb6d020eff2820aa2279c95a06c835f974add9efe22a7e028c1ba5a6"

RPROVIDES:${PN} += "dateutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
