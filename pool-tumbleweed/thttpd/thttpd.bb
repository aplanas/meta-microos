SUMMARY = "Small and simple webserver"
DESCRIPTION = "Thttpd is a compact httpd serving daemon that can handle \
high loads. While lacking many of the advanced features of Roxen \
or Apache, thttpd operates without forking and is efficient \
in memory use. Basic support for CGI scripts, authentication, and SSI \
is provided. Advanced features include the ability to throttle \
traffic."
LICENSE = "BSD-3-Clause"

PV = "2.29"

RPM_NAME = "thttpd-2.29-4.3.aarch64.rpm"
RPM_HASH = "b8f8afe6eb1f7082efc984cda9b416c364c44eaf9b14c16c2ee83a7ba62ba0f9664c164c4753f1d80e3442b285d487a559d390e06443bc44622b3e585086f117"

RPROVIDES:${PN} += "config(thttpd) \
http_daemon \
thttpd \
thttpd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(www) \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
permissions"

inherit rpm
