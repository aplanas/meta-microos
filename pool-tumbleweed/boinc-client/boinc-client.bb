SUMMARY = "Client for Berkeley Open Infrastructure for Network Computing"
DESCRIPTION = "The Berkeley Open Infrastructure for Network Computing (BOINC) is a \
software platform which supports distributed computing, primarily in \
the form of 'volunteer' computing and 'desktop grid' computing. It is \
well suited for problems which are often described as 'trivially \
parallel'. BOINC is the underlying software used by projects such as \
Einstein@Home, ClimatePrediciton.net, the World Community \
Grid, and many other distributed computing projects. \
 \
This package installs the BOINC client software, which will allow \
your computer to participate in one or more BOINC projects, using \
your spare computer time to search for cures for diseases, model \
protein folding, study global warming, discover sources of \
gravitational waves, and many other types of scientific and \
mathematical research."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.24.1"

RPM_NAME = "boinc-client-7.24.1-1.1.aarch64.rpm"
RPM_HASH = "49188d084146053ad01cf3e7c660d7f4d581ce8844b0bd4cdd518211dfaa89b0c1235d3aeae2fcc5af53c77065015bc4598ca3328b2e4fa8e2ee221baadf977d"

RPROVIDES:${PN} += "boinc-client \
config-boinc-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates-mozilla \
ld-linux-aarch64.so.1 \
libboinc-crypt.so.7 \
libboinc.so.7 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
shadow"

inherit rpm
