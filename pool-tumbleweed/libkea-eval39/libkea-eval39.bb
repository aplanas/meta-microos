SUMMARY = "Kea DHCP expression evaluation library"
DESCRIPTION = "The core of the libeval library is a parser that is able to parse an \
expression (e.g. option[123].text == 'APC'). This is currently used \
for client classification."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-eval39-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "678542ad11e2ada6923c5629a9aa59901754bfe946b93c1679206d4d6d9e7806e032347c987acd9b2d28e57c6c31e6b693038ed8631d381a736ce9edc31cf019"

RPROVIDES:${PN} += "libkea-eval.so.39()(64bit) \
libkea-eval39 \
libkea-eval39(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-dhcp++.so.54()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-log.so.35()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
