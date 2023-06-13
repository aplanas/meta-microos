SUMMARY = "UPS monitoring daemon"
DESCRIPTION = "powerd monitors the serial port connected to an UPS device and will perform \
an unattended shutdown of the system if the UPS is on battery longer \
than a specified number of minutes."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "powerd-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "1479473f7deba2fa77e1ca8c1e3da93d29df5c8dfb7e7d8b8e54b0937f945e08880284cb9fd2f9e534f4a94f465b60e16c20d5b49187d2fac4fa12b7c52add7b"

RPROVIDES:${PN} += "config(powerd) \
powerd \
powerd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
