SUMMARY = "A C library for parsing command line parameters"
DESCRIPTION = "Popt is a C library for parsing command line parameters.  Popt was \
heavily influenced by the getopt() and getopt_long() functions. It \
improves on them by allowing more powerful argument expansion. Popt can \
parse arbitrary argv[] style arrays and automatically set variables \
based on command line arguments.  Popt allows command line arguments to \
be aliased via configuration files and includes utility functions for \
parsing arbitrary strings into argv[] arrays using shell-like rules."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "libpopt0-1.19-1.4.aarch64.rpm"
RPM_HASH = "6476e1d48aaa14adacbfef76310a89bdc2f0ec925fc4a32bf5322140bcb3a474b6e9de22d1ab94f4c4a0e661f93caaff85c50678548a5b89a6f8cbe906b6ae3b"

RPROVIDES:${PN} += "libpopt.so.0 \
libpopt0 \
popt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
