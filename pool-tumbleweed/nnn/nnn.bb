SUMMARY = "Terminal based file browser"
DESCRIPTION = "nnn is a fork of noice, a terminal file browser with keyboard \
shortcuts for navigation, opening files and running tasks. There is \
no config file and MIME associations are hard-coded."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-4.8-1.2.aarch64.rpm"
RPM_HASH = "94fd3b619ef551925090ad8714b392e07b1bc929b3436d70722e96fc2cced28b0024c909eafc36fa2374c82422e6bd17e2043b1e31f1d8e32bd0ae5e54297583"

RPROVIDES:${PN} += "nnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
