SUMMARY = "Trivial File Transfer Protocol (TFTP)"
DESCRIPTION = "The Trivial File Transfer Protocol (TFTP) is normally used only for \
booting diskless workstations and for getting or saving network \
component configuration files."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "tftp-5.2-26.3.aarch64.rpm"
RPM_HASH = "e37c1db5a2f2ffb511285d8726a7ea83f9b410c151c7c6734146345653a4aaeda127cebd8ea6c716af164dbccf6881c2c6aa2282943b0ebbf404d54aaa1295d2"

RPROVIDES:${PN} += "tftp \
tftp-client \
tftp-server"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
libwrap.so.0 \
netcfg \
user-tftp"

inherit rpm
