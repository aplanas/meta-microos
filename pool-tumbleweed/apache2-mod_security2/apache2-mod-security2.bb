SUMMARY = "Web Application Firewall for apache httpd"
DESCRIPTION = "ModSecurity is an intrusion detection and prevention \
engine for web applications (or a web application firewall). Operating \
as an Apache Web server module or standalone, the purpose of \
ModSecurity is to increase web application security, protecting web \
applications from known and unknown attacks."
LICENSE = "Apache-2.0"

PV = "2.9.4"

RPM_NAME = "apache2-mod_security2-2.9.4-1.9.aarch64.rpm"
RPM_HASH = "df774223c7378bdc856d584aa5f67f8e7b160bed6eaa6079dbb98e3813f670640099973b1d9af430077095dd474b6ce9be55e22c75e5815a6f1c1140d19f82bb"

RPROVIDES:${PN} += "apache2-mod-security2 \
config-apache2-mod-security2"

RDEPENDS:${PN} += "/usr/bin/perl \
apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcurl.so.4 \
liblua5.3.so.5 \
libpcre.so.1 \
libxml2.so.2 \
suse-maintenance-mmn-0"

inherit rpm
