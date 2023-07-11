SUMMARY = "RepRap printer interface and tools"
DESCRIPTION = "Printrun is a set of G-code sending applications for RepRap. \
It consists of printcore (dumb G-code sender), pronsole (featured command line \
G-code sender), pronterface (featured G-code sender with graphical user \
interface), and a small collection of helpful scripts. Together with skeinforge \
they form a pretty powerful softwarecombo. This package installs whole Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "Printrun-2.0.0~rc7.1599393390.c451359-3.13.aarch64.rpm"
RPM_HASH = "3dfcb93d1916c425dded28b2e4530d2e299c35dd07d98a701a96d0920fcc4d58bd937821d2af6679d9533fd86f9585a43e474e4e8d123bad6e480a145740a491"

RPROVIDES:${PN} += "Printrun"

RDEPENDS:${PN} += "plater \
pronsole \
pronterface"

inherit rpm
