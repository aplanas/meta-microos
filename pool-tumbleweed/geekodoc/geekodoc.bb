SUMMARY = "DocBook based RNG Schema for SUSE Documentation"
DESCRIPTION = "GeekoDoc is a RELAX NG schema used for current SUSE documentation."
LICENSE = "GPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "geekodoc-2.2.2-11.1.noarch.rpm"
RPM_HASH = "bd538c4e00909ad5c8e062f0315a7de77f8e7cdb68d3641c983448100d5711a69ec3a9c9b9d7ad92e14d49b0ddecbd1721c668c52a0d28fa5bd458c6b12ae708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(geekodoc) \
geekodoc"

RDEPENDS:${PN} += "/bin/sh \
sgml-skel"

inherit rpm
