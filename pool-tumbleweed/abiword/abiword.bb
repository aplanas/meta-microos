SUMMARY = "A Multiplatform Word Processor"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "abiword-3.0.5-2.9.aarch64.rpm"
RPM_HASH = "49ba3b54802f8019f93c9bfe678c7fe975c3e427aff1ab1c048f3ea1da2e78b3fad32867c9d644a1212f04c40a9f76ed7adee24680925ea04bfdbe87268bb9a5"

RPROVIDES:${PN} += "abiword"

RDEPENDS:${PN} += "libabiword-3.0.so \
libc.so.6"

inherit rpm
