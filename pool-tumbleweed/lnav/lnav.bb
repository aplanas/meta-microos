SUMMARY = "Logfile Navigator"
DESCRIPTION = "The Logfile Navigator, lnav for short, is a curses-based tool for viewing and \
analyzing log files. The value added by lnav over text viewers or editors is \
that it takes advantage of any semantic information that can be gleaned from \
the log file, such as timestamps and log levels. Using this extra semantic \
information, lnav can do things like interleaving messages from different \
files, generate histograms of messages over time, and provide hotkeys for \
navigating through the file. These features are meant to allow the user to \
quickly and efficiently focus on problems."
LICENSE = "BSD-2-Clause"

PV = "0.11.2"

RPM_NAME = "lnav-0.11.2-1.1.aarch64.rpm"
RPM_HASH = "38eceb55283ead52305238134b61819cd3436efb60b47c614f6c6460758d3e6025532f7993fd635309f0f1ac8fdcef576a33d7dcd0942f4c5b50e05c2f1f8ebe"

RPROVIDES:${PN} += "lnav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libreadline.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
