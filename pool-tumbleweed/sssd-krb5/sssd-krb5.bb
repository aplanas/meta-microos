SUMMARY = "The Kerberos authentication backend plugin for sssd"
DESCRIPTION = "Provides the Kerberos back end that the SSSD can utilize authenticate \
against a Kerberos server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-krb5-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "1a493c171521dddf275423eb7ad301f6be6c1f9a650cf2b9ba4a7a1fcb966c0dec108ff6e4f1fb8de64d8b086c961b421e14a1c1766a289e79462c5da24eaf97"

RPROVIDES:${PN} += "libsss-krb5.so \
sssd-krb5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-debug.so \
libsss-krb5-common.so \
libsss-util.so \
libtalloc.so.2 \
sssd-krb5-common"

inherit rpm
