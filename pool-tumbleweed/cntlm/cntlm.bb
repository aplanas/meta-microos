SUMMARY = "Fast NTLM authentication proxy with tunneling"
DESCRIPTION = "Cntlm is a fast and efficient NTLM proxy, with support for TCP/IP tunneling, \
authenticated connection caching, ACLs, proper daemon logging and behaviour \
and much more. It has up to ten times faster responses than similar NTLM \
proxies, while using by orders or magnitude less RAM and CPU. Manual page \
contains detailed information."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.3"

RPM_NAME = "cntlm-0.92.3-11.8.aarch64.rpm"
RPM_HASH = "5cf414cba455a2f47f05f06afb92d8735b7609682076b618260dfa12653ebc153d76c4e13687da059f953e3aa58ca4c7b998a9d2f42eccb6edb8314339886bf7"

RPROVIDES:${PN} += "cntlm \
config-cntlm"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
group-nogroup \
ld-linux-aarch64.so.1 \
libc.so.6 \
pwdutils \
systemd"

inherit rpm
