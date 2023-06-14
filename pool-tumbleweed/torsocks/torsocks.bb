SUMMARY = "Use SOCKS-friendly applications with Tor"
DESCRIPTION = "Torsocks allows you to use most applications in a safe way with Tor. \
It ensures that DNS requests are handled safely and explicitly rejects \
any traffic other than TCP from the application you're using. \
 \
Torsocks is an ELF shared library that is loaded before all others. \
The library overrides every needed Internet communication libc function \
calls such as connect(2) or gethostbyname(3). \
 \
This process is transparent to the user and if torsocks detects any \
communication that can't go through the Tor network such as UDP traffic, \
for instance, the connection is denied. If, for any reason, there is no way \
for torsocks to provide the Tor anonymity guarantee to your application, \
torsocks will force the application to quit and stop everything. \
 \
Adjust when needed /etc/tor/torsocks.conf and use Torsocks with \
 \
    torsocks application \
 \
So, for example you can use ssh to a some.ssh.com by doing \
 \
    torsocks ssh -p SSH-Port -i ~/.ssh/ssh-key.rsa username@some.ssh.com \
 \
You can use in /etc/bash.bashrc.local or /etc/zsh.zshrc.local alias \
 \
    alias slogin-='torsocks slogin' \
 \
And can ajust ~/.ssh/config with your data for server or PC and then use simple \
 \
    slogin- server \
 \
or add too an alias \
 \
    alias slogin-server='slogin- server' \
 \
and use simple \
 \
    slogin-server"
LICENSE = "GPL-2.0-only"

PV = "2.4.0"

RPM_NAME = "torsocks-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "11de5b819839d64200c92b2925bc06e6c9f093c63ebcd892eef842894ce1eb256ad51e52bd1ad8e546f6fe940617e3edabb139b5c26425d4d5eac4c6ca864457"

RPROVIDES:${PN} += "config-torsocks \
libtorsocks.so.0 \
torsocks"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
