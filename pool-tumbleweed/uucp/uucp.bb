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

RPM_NAME = "uucp-1.07-5.1.aarch64.rpm"
RPM_HASH = "ebcbc87576425e4a65765293303ed702973d854723f3d7fb636b5c0be615ad9389ee2e724bb8bcfea68eef9430b0c2afad4fb4a92b289a639b44d875cb6f5143"

RPROVIDES:${PN} += "config-uucp \
uucp"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates \
filesystem \
fileutils \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
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
