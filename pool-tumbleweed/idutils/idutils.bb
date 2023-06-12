SUMMARY = "Language-Independent Identifier Database Tool"
DESCRIPTION = "Mkid is a simple, fast, high-capacity, and language-independent \
identifier database tool.  Actually, the term identifier is too \
limiting--mkid stores tokens, be they program identifiers of any form, \
literal numbers, or ordinary words.  Database queries can be issued \
from the command line or from within Emacs, serving as an augmented \
tags facility."
LICENSE = "GPL-2.0-or-later"

PV = "4.6"

RPM_NAME = "idutils-4.6-4.11.aarch64.rpm"
RPM_HASH = "e0c2747efefaf85d90a50c4b79b446a7c63f16c364c7b5d6b675f9545858e72c9c48ea68ccc507057790a9b5a7412ec5db1b51528288692dac54b189b6a038b2"

RPROVIDES:${PN} += "config(idutils) \
id-utils \
idutils \
idutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
