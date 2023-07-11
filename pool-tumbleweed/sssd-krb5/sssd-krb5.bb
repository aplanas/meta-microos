SUMMARY = "The Kerberos authentication backend plugin for sssd"
DESCRIPTION = "Provides the Kerberos back end that the SSSD can utilize authenticate \
against a Kerberos server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-krb5-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "9595a5951698c54cbbe6461c2ee7772b4985844b12e1bc4c56244564a0ac913a14bd238f934a12e9894e358adf3e0297a466c0ebbcc74667f99ac7fdba42e105"

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
