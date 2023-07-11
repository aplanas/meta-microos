SUMMARY = "Trivial File Transfer Protocol (TFTP)"
DESCRIPTION = "The Trivial File Transfer Protocol (TFTP) is normally used only for \
booting diskless workstations and for getting or saving network \
component configuration files."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "tftp-5.2-26.4.aarch64.rpm"
RPM_HASH = "44be75f6c286c3264fb7bd06e66a084b8ee158bd0be9d3a5cf356d9036f44648f8e4bab3bcf3f2ecce1f137c31478fe27bc9e628bf1afb15f0c328dea1d87143"

RPROVIDES:${PN} += "tftp \
tftp-client \
tftp-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
libwrap.so.0 \
netcfg \
user-tftp"

inherit rpm
