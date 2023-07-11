SUMMARY = "Default plugins for the audit dispatcher"
DESCRIPTION = "The audit-audispd-plugins package contains plugin components for the \
audit dispatcher (audispd)."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.9"

RPM_NAME = "audit-audispd-plugins-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "894f74958ffa8d365b0fcf2d43f24a0e4b4ac34d5bf555bfdcc7422f5e1846a74fda3fe8c6b640eb592e646f9c395a42b49090d543be5460e99f44ec74780d0e"

RPROVIDES:${PN} += "audit-audispd-plugins \
config-audit-audispd-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libauparse.so.0 \
libc.so.6 \
libcap-ng.so.0 \
liblber.so.2 \
libldap.so.2"

inherit rpm
