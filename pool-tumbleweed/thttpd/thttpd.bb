SUMMARY = "Small and simple webserver"
DESCRIPTION = "Thttpd is a compact httpd serving daemon that can handle \
high loads. While lacking many of the advanced features of Roxen \
or Apache, thttpd operates without forking and is efficient \
in memory use. Basic support for CGI scripts, authentication, and SSI \
is provided. Advanced features include the ability to throttle \
traffic."
LICENSE = "BSD-3-Clause"

PV = "2.29"

RPM_NAME = "thttpd-2.29-4.4.aarch64.rpm"
RPM_HASH = "3e8cc9b1614417209e834091d982a202c22b6d87786b2323f423c54de42697da7259cfee0d545d6d5bfeb371ae273533a3676ad4185585835de18de3a272f71c"

RPROVIDES:${PN} += "config-thttpd \
http-daemon \
thttpd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-www \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
permissions"

inherit rpm
