SUMMARY = "Tool for converting texinfo documents to HTML"
DESCRIPTION = "Tex­i2roff trans­lates tex­info doc­u­ments to nroff/troff (it does not deal \
with Plain TeX or LaTeX sources). While the conversion is not complete, it \
provides a solid basis for translating most texinfo documentation."
LICENSE = "SUSE-Permissive-Modify-By-Patch"

PV = "2.0"

RPM_NAME = "texi2roff-2.0-3.3.aarch64.rpm"
RPM_HASH = "9c9483aec21147fb70992b4717748e5dad9a73c28d309a09ac39183b55c1140b765daa50e7c548392c320d6aa21bfa4da8818ee9bc391326bc99ed3e10657804"

RPROVIDES:${PN} += "texi2roff \
texinfo-/usr/bin/texi2roff"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
