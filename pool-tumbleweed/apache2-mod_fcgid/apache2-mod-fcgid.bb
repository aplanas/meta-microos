SUMMARY = "Alternative FastCGI module for Apache2"
DESCRIPTION = "A binary compatibile alternative to the Apache module mod_fastcgi. \
 \
The module implements an efficient process pool management for external \
CGI program invocation. The pool of CGI programs is mapped against the \
pool of apache workers in such way that there is always a weighted number \
of programs waiting for requests in the pool. \
 \
To load the module into Apache, run the command 'a2enmod fcgid' as \
root. \
 \
See /etc/apache2/conf.d/mod_fcgid.conf and \
/usr/share/doc/packages/apache2-mod_fcgid for configuration."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.9"

RPM_NAME = "apache2-mod_fcgid-2.3.9-11.11.aarch64.rpm"
RPM_HASH = "1f41673f5a0ed42f2eb43a98ec6a1be9caf3f4881a83ff1367506bab0972b51731c79b91d80db4153f882f8c51ae3f09c5abc6dbb8f612aea28ede4cb8add63c"

RPROVIDES:${PN} += "apache2-mod_fcgid \
apache2-mod_fcgid(aarch-64) \
config(apache2-mod_fcgid)"

RDEPENDS:${PN} += "apache2 \
apache_mmn_20120211 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
suse_maintenance_mmn_0"

inherit rpm
