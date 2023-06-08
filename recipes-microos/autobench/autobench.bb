SUMMARY = "Simple Perl script for automating the process of benchmarking a web server"
DESCRIPTION = "Autobench is a simple Perl script for automating the process of benchmarking \
a web server (or for conducting a comparative test of two different web \
servers). The script is a wrapper around  httperf. Autobench runs httperf a \
number of times against each host, increasing the number of requested \
connections per second on each iteration, and extracts the significant data \
from the httperf output, delivering a CSV or TSV format file which can be \
imported directly into a spreadsheet for analysis/graphing."
LICENSE = "GPL-2.0-only"

PV = "2.1.2"

RPM_NAME = "autobench-2.1.2-3.13.aarch64.rpm"
RPM_HASH = "6a584701304cf5002c7c4f1ebc889621b0468ae56ec5747153207d24cd715531a3d4bcd15d5df3b986f82f0e274939d82abb806eee7cf0302858447f7a71147b"

RPROVIDES:${PN} += "autobench autobench(aarch-64) config(autobench)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl gawk gnuplot httperf ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) perl"

inherit rpm
