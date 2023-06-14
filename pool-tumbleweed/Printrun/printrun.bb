SUMMARY = "RepRap printer interface and tools"
DESCRIPTION = "Printrun is a set of G-code sending applications for RepRap. \
It consists of printcore (dumb G-code sender), pronsole (featured command line \
G-code sender), pronterface (featured G-code sender with graphical user \
interface), and a small collection of helpful scripts. Together with skeinforge \
they form a pretty powerful softwarecombo. This package installs whole Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "Printrun-2.0.0~rc7.1599393390.c451359-3.12.aarch64.rpm"
RPM_HASH = "6d3980f6f79fa5a6fb1bc53621c1b4f10b590cb13a9c2000007d24d9e02b6a1b6503d0a844ccc3824524f8712c3fccbd1561402a027d16e2204a45c9d5ac24e1"

RPROVIDES:${PN} += "Printrun"

RDEPENDS:${PN} += "plater \
pronsole \
pronterface"

inherit rpm
