SUMMARY = "Web Application Firewall for apache httpd"
DESCRIPTION = "ModSecurity is an intrusion detection and prevention \
engine for web applications (or a web application firewall). Operating \
as an Apache Web server module or standalone, the purpose of \
ModSecurity is to increase web application security, protecting web \
applications from known and unknown attacks."
LICENSE = "Apache-2.0"

PV = "2.9.4"

RPM_NAME = "apache2-mod_security2-2.9.4-1.8.aarch64.rpm"
RPM_HASH = "7048ee974ee637ad06930aa9b5819321af08dc9c50010a2e932a5a81eda9cba7f084a2b140020fd43909d97c7f9aaf7b2146511124b63d587c674e1a99e19ac8"

RPROVIDES:${PN} += "apache2-mod_security2 \
apache2-mod_security2(aarch-64) \
config(apache2-mod_security2)"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2 \
apache_mmn_20120211 \
ld-linux-aarch64.so.1()(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
liblua5.3.so.5()(64bit) \
libpcre.so.1()(64bit) \
libxml2.so.2()(64bit) \
suse_maintenance_mmn_0"

inherit rpm
