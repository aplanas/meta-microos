SUMMARY = "Tcl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Tcl language."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-tcl-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "43306a89530cc02935956d37d85acf7dd568723b1d6c01bda7af668251d899d19c25b0eb99a134fc6d2e4fff0578db55f06d4b3ee40f215750ce2de961d91ff2"

RPROVIDES:${PN} += "weechat-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
weechat"

inherit rpm
