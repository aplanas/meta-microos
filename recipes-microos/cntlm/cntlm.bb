SUMMARY = "Fast NTLM authentication proxy with tunneling"
DESCRIPTION = "Cntlm is a fast and efficient NTLM proxy, with support for TCP/IP tunneling, \
authenticated connection caching, ACLs, proper daemon logging and behaviour \
and much more. It has up to ten times faster responses than similar NTLM \
proxies, while using by orders or magnitude less RAM and CPU. Manual page \
contains detailed information."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.3"

RPM_NAME = "cntlm-0.92.3-11.7.aarch64.rpm"
RPM_HASH = "733a7958aad985177ecc19b5d1d66da45e21920cf12bcaa992c91e49a06474455a0404fc9c68090d35daf80b65f4072d5acfb26113287185bce85115c154153c"

RPROVIDES:${PN} += "cntlm \
cntlm(aarch-64) \
config(cntlm)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
grep \
group(nogroup) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
pwdutils \
systemd"

inherit rpm
