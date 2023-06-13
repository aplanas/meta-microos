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

PV = "0.11.1"

RPM_NAME = "lnav-0.11.1-2.1.aarch64.rpm"
RPM_HASH = "30e016b70aff636343ced6d37ccad9ed760160d629fbcbaba05605509f0b2aedf16feca87d9ec561f6c2fbde432f57225ca12f457e5ea3ed577c58b99b577e21"

RPROVIDES:${PN} += "application() \
application(lnav.desktop) \
lnav \
lnav(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
libreadline.so.8()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
