SUMMARY = "Network UPS Tools Web Server Support (UPS Status Pages)"
DESCRIPTION = "Web server support package for the Network UPS Tools. \
 \
Predefined URL is http://localhost/nut/index.html \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-cgi-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "8cd55a21be461ab872201efc8ae1599295510b1b2682e0fa34c8768cdea9a826d101cf783951d611c72c78f489bacdae04284fbb3c79f6ccdfb2a9c4f06937c3"

RPROVIDES:${PN} += "config-nut-cgi \
nut-cgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libupsclient.so.6 \
nut"

inherit rpm
