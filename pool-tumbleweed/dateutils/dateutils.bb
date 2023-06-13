SUMMARY = "Command line date and time utilities"
DESCRIPTION = "Dateutils are a bunch of tools that revolve around fiddling with dates \
and times in the command line with a strong focus on use cases that \
arise when dealing with large amounts of financial data. Their target \
market is shell scripts that need date calculations or calendar \
conversions, and as such they are highly pipe-able and modeled after \
their well-known cousins (e.g. dtest vs. test, or dgrep vs. grep)."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "dateutils-0.4.10-2.3.aarch64.rpm"
RPM_HASH = "ad1be1cf4ca261149382546c97a976f0d9fdaf11bf0136514b7262653eadd14e398b26d883a89eada900180b873715eebdffef50d2aed4c0e1fc9aa654b47971"

RPROVIDES:${PN} += "dateutils \
dateutils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
