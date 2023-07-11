SUMMARY = "Taylor Unix-to-Unix copy"
DESCRIPTION = "Ian Taylor's Unix to Unix copy: mail and news over modem lines. This is \
the standard UUCP package from the Free Software Foundation. It is \
configured to use HoneyDanBer or Taylor configuration files. With \
version 6.0 of SuSE Linux, the configuration directory has been moved \
to /etc/uucp. \
 \
Exactly: \
Taylor config:	 /etc/uucp \
HoneyDanBer config: /etc/uucp/hdb_config \
 \
If you have your own setup under {_localstatedir}/lib/uucp, please \
%move it to /etc/uucp. \
Example configurations can be found in /usr/share/doc/packages/uucp. \
 \
We did not include a uucp guest account. If you want to create a guest \
account, make sure the directory /var/spool/uucppublic exists."
LICENSE = "GPL-2.0-or-later"

PV = "1.07"

RPM_NAME = "uucp-1.07-4.4.aarch64.rpm"
RPM_HASH = "0340db3a5eb7e3fe7e5506e96b5a04640422d8060cf126d44009f8904a71c268a06661d75e74a764e425458bcf019f40f3c51392d2f3ac97edda807869222e5c"

RPROVIDES:${PN} += "config-uucp \
uucp"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates \
filesystem \
fileutils \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblockdev.so.1 \
libnss-usrfiles2 \
logrotate \
netcfg \
openssl \
permissions \
rmail \
stunnel \
systemd \
user-uucp"

inherit rpm
