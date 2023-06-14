SUMMARY = "PAM authentication in lighttpd"
DESCRIPTION = "A module to provide PAM authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_pam-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "3fa6931cdc0215cb4446c6ce47c84ea9791d3c5312bbddc53d41f71bf63f2bbb5d2e3758fa5ba51f5f1989d9d35c695a02fcff0818ab970ab5227ce7e145b5fa"

RPROVIDES:${PN} += "lighttpd-mod-authn-pam"

RDEPENDS:${PN} += "libc.so.6 \
libpam.so.0 \
lighttpd"

inherit rpm
