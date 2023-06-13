SUMMARY = "HangulCode Conversion Program"
DESCRIPTION = "HangulCode conversion program. \
 \
 \
 \
Authors: \
-------- \
    Jungshik Shin &lt;jshin@pantheon.yale.edu&gt;"
LICENSE = "SUSE-Public-Domain"

PV = "1.0pl5"

RPM_NAME = "hmconv-1.0pl5-673.26.aarch64.rpm"
RPM_HASH = "f1065a073b1db036f92b64e4b2643cefe7d4f2d029b7fe9eda466b2d3c57b2a1004ff38ad84b2db54df3f743ed9038ffeca9a8498f8b3a8a5a1eea01a022c614"

RPROVIDES:${PN} += "hmconv \
hmconv(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
