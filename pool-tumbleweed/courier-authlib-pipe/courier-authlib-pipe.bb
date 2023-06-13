SUMMARY = "Pipe support for the Courier authentication library"
DESCRIPTION = "This package installs Pipe support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
Pipe."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-pipe-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "0bc7f85fac10792d7d5f0b4351e5f93edb86351494593f2da9b46b1c6685644eafdcaa96b52a5149025b7abc52775287fe0f3316a775348a280933c459ab002f"

RPROVIDES:${PN} += "courier-authlib-pipe \
courier-authlib-pipe(aarch-64) \
libauthpipe.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcourierauth.so.0()(64bit)"

inherit rpm
