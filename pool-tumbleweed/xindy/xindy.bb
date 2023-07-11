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

RPM_NAME = "xindy-2.5.1-2.27.aarch64.rpm"
RPM_HASH = "58fca2b4e6c5e08aa420f1aed090ac288f6954d2cf026ba64fa72503e079518c47a3c544517b16c1a7886eacf48c117220dda620ab48898b2efbc271462af235"

RPROVIDES:${PN} += "xindy"

RDEPENDS:${PN} += "/usr/bin/env \
clisp \
libc.so.6 \
xindy-rules"

inherit rpm
