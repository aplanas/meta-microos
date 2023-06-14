SUMMARY = "Development files for tecla, an interactive command line editing library"
DESCRIPTION = "The tecla library provides programs with interactive command line \
editing facilities, similar to those of the tcsh shell."
LICENSE = "X11"

PV = "1.6.3"

RPM_NAME = "tecla-devel-1.6.3-3.15.aarch64.rpm"
RPM_HASH = "e1213692c2e9b3cb8919195ada3e05bec252093103579b34e47f51d20f2389595fdadd5514ea0bcc34586ce441f473b7d89c7d3421bd2dfe5e3ca578c5506b1d"

RPROVIDES:${PN} += "tecla-devel"

RDEPENDS:${PN} += "libtecla-r1"

inherit rpm
