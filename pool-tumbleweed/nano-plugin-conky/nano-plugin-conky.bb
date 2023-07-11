SUMMARY = "Conky Configuration File Support for nano"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides syntax highlighting support for conky \
configuration files in nano."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "nano-plugin-conky-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "b3dd4e49239847fe137de64ff9214f8d6a321d9649e5c301bdaa0d9239b173972d3e9ed4cb8b961d2c2542a4c0608e4858fb1913d2d8a826f651041d49f14234"

RPROVIDES:${PN} += "conky-nano \
nano-plugin-conky"

RDEPENDS:${PN} += ""

inherit rpm
