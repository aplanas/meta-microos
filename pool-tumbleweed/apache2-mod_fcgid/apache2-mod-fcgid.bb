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

RPM_NAME = "apache2-mod_fcgid-2.3.9-11.12.aarch64.rpm"
RPM_HASH = "711f878143a8adcf51992697c63a35f81d645993f2642619b22e6cfe878ad1b8ba25c72f1b386782d22e38db7b6028f465bfbef9d11014e9c6d8b59fe42349c1"

RPROVIDES:${PN} += "apache2-mod-fcgid \
config-apache2-mod-fcgid"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
suse-maintenance-mmn-0"

inherit rpm
