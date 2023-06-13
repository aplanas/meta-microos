SUMMARY = "Serial port to network proxy"
DESCRIPTION = "ser2net provides a way for a user to connect from a network connection to a \
serial port. It provides all the serial port setup, a configuration file to \
configure the ports, a control login for modifying port parameters, \
monitoring ports, and controlling ports."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.11"

RPM_NAME = "ser2net-4.3.11-1.2.aarch64.rpm"
RPM_HASH = "2b95c0d7f03d75421b63db60000f6329f227b3bf0d75eb84065185894a597c52257fbe0431da49e54f4b4a8eaefe61f4d89eaa54a52867f4ce577cd2d02b3b1e"

RPROVIDES:${PN} += "config(ser2net) \
ser2net \
ser2net(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgensio.so.4()(64bit) \
libgensiomdns.so.0()(64bit) \
libgensioosh.so.0()(64bit) \
libyaml-0.so.2()(64bit) \
systemd"

inherit rpm
