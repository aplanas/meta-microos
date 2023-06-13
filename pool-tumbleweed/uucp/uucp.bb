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

RPM_NAME = "uucp-1.07-4.3.aarch64.rpm"
RPM_HASH = "6f2e1f3336135925dc46781bb74ddbcb2f961b12b90bb5d90fefcc7775d6ad19ef157228b0463c907cfe2147679583497b26795d6bda11dfa2fc0f37a228e641"

RPROVIDES:${PN} += "config(uucp) \
uucp \
uucp(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ca-certificates \
filesystem \
fileutils \
group(uucp) \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblockdev.so.1()(64bit) \
libnss_usrfiles2 \
logrotate \
netcfg \
openssl \
permissions \
rmail \
stunnel \
systemd \
user(uucp)"

inherit rpm
