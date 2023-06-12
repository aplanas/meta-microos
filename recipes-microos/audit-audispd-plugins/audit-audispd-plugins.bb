SUMMARY = "Default plugins for the audit dispatcher"
DESCRIPTION = "The audit-audispd-plugins package contains plugin components for the \
audit dispatcher (audispd)."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.9"

RPM_NAME = "audit-audispd-plugins-3.0.9-1.3.aarch64.rpm"
RPM_HASH = "6776d165f1a0e04d052c3c1a3a919970b3859e4c92606d58cf23a5d723c32ae787910c036f6c5f0b4ac34fe5d9548c024defd74942a6e128e0e1b44c8b4d6adc"

RPROVIDES:${PN} += "audit-audispd-plugins \
audit-audispd-plugins(aarch-64) \
config(audit-audispd-plugins)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libauparse.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap-ng.so.0()(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
