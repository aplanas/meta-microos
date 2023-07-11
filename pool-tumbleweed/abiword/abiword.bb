SUMMARY = "A Multiplatform Word Processor"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "abiword-3.0.5-2.10.aarch64.rpm"
RPM_HASH = "3fb904fece67b0add8315a23a0baf478349587f8184eaf471b031cbc5818bc5cd0956af2b08bd9d1dc6de2bbdd68dc309b4c086167eb0a7955d673b647cc087b"

RPROVIDES:${PN} += "abiword"

RDEPENDS:${PN} += "libabiword-3.0.so \
libc.so.6"

inherit rpm
