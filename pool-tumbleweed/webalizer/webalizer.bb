SUMMARY = "A Web Server Log File Analysis Program"
DESCRIPTION = "Webalizer is a web server log file analysis program which produces \
usage statistics in HTML format for viewing with a browser.  The \
results are presented in both columnar and graphical formats, which \
facilitates interpretation.  Yearly, monthly, daily, and hourly usage \
statistics are presented, along with the ability to display usage by \
site, URL, referrer, user agent (browser) and country (user agent and \
referrer are only available if your web server produces Combined log \
format files). \
 \
Webalizer supports CLF (common log format) log files, as well as \
Combined log formats as defined by NCSA and others, and variations of \
these which it attempts to handle intelligently."
LICENSE = "GPL-2.0-or-later"

PV = "2.23"

RPM_NAME = "webalizer-2.23-26.10.aarch64.rpm"
RPM_HASH = "cc6edfba1248727ffadba36811651f68bff06338732954745959efd25264dcb889ece57f7a68804878bb9d9e65ddb6d65355757209e6de4b3a5876b562fcd6f2"

RPROVIDES:${PN} += "config-webalizer \
webalizer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libdb-4.8.so \
libgd.so.3 \
libm.so.6 \
libz.so.1 \
webalizer-flags"

inherit rpm
