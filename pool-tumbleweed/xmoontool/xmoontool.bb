SUMMARY = "The Moon in focus"
DESCRIPTION = "One of the most important programs existing :-) Using this program, you \
can display all important information about the moon constantly. At \
last... \
 \
Hint: The option -c makes it also work with color ;-)"
LICENSE = "SUSE-Public-Domain"

PV = "22.9.94"

RPM_NAME = "xmoontool-22.9.94-977.26.aarch64.rpm"
RPM_HASH = "a5c77ee97d912856c76d9324b73c3420d3a61d62aaa87e89eb172d0d5c24f59af42b51137fd7827455937ab32f4913837ad6e95220bdde48c3e86d9634a447b2"

RPROVIDES:${PN} += "moontool \
xmoontool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
