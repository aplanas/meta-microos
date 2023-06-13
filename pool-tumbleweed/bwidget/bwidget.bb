SUMMARY = "A Set of Megawidgets for Tcl/Tk"
DESCRIPTION = "Add useful and nice-looking widgets to your interfaces with the BWidget \
Toolkit, a set of native Tk 8.x Widgets using Tcl8.x namespaces. The \
BWidgets have a professional look and feel as in other well-known \
toolkits (Tix or Incr Widget). However, the concept is radically \
different because everything is native. There is no platform \
compilation and no compiled extension libraries are needed. The code is \
in pure Tcl/Tk."
LICENSE = "BSD-3-Clause"

PV = "1.9.14"

RPM_NAME = "bwidget-1.9.14-1.8.noarch.rpm"
RPM_HASH = "02be3e4818b81ebaedc1a67ec278f1757cb76897f070e6cf32b27fc8c8cca0e57ffdf14b30281e387089c8a1d8cdd068f48d2585a2b99fc2f4d4df845bcfdd2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bwidget"

RDEPENDS:${PN} += "tk"

inherit rpm
