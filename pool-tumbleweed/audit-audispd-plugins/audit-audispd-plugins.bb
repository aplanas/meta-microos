SUMMARY = "Default plugins for the audit dispatcher"
DESCRIPTION = "The audit-audispd-plugins package contains plugin components for the \
audit dispatcher (audispd)."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "audit-audispd-plugins-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "e22e945a7bda91a0eac6a755ee403249a2cf42843d591fcca36478734f14c838b89e0b855d1794adbb8f78b213893215e0cb133eec72c20030256ea753b8e434"

RPROVIDES:${PN} += "audit-audispd-plugins \
config-audit-audispd-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libauparse.so.0 \
libc.so.6 \
libcap-ng.so.0 \
liblber.so.2 \
libldap.so.2"

inherit rpm
