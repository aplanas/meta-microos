SUMMARY = "Spreadsheet Calculator"
DESCRIPTION = "sc is a free curses-based spreadsheet program that uses key bindings similar to \
vi and less."
LICENSE = "SUSE-Public-Domain"

PV = "7.16"

RPM_NAME = "sc-7.16-13.30.aarch64.rpm"
RPM_HASH = "f16c9f769b8de0489160b2019e42f46201913ec6b41b7b3b1f7b135a35e2d26588e98cfe18f169b318dd36e5cab23b4193d99d99bbf42ca0a273098283f461a1"

RPROVIDES:${PN} += "sc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
