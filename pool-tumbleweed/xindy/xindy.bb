SUMMARY = "Index generator for structured documents like LaTeX or SGML"
DESCRIPTION = "xindy is an index processor that can be used to generate book-like \
indexes for arbitrary document-preparation systems. This includes \
systems such as TeX and LaTeX, the roff-family, SGML/XML-based \
systems (e.g. HTML) that process some kind of text and generate \
indexing information. The kernel system is not fixed to any specific \
system, but can be configured to work together with such systems. \
 \
In comparison to other index processors xindy has several powerful \
features that make it an ideal framework for describing and \
generating complex indices, addressing especially international \
indexing."
LICENSE = "GPL-2.0+"

PV = "2.5.1"

RPM_NAME = "xindy-2.5.1-2.24.aarch64.rpm"
RPM_HASH = "1cc06b2bc582090b4f12130973a6bb97f7f805bc38b9df457d5effb9e8cef47a19c3fa7a62ac0ddd763f9dba6044933a55fe296b735aca83004c73f21ee870cd"

RPROVIDES:${PN} += "xindy \
xindy(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
clisp \
libc.so.6()(64bit) \
xindy-rules"

inherit rpm
