SUMMARY = "Shell-like regular expressions"
DESCRIPTION = "Provides shell-like regular expressions.  The wildcards provided are ?, \
* and **, where ** is like * but matches /.  See compile_shellish for \
details. \
 \
 \
 \
Authors: \
-------- \
    Barrie Slaymaker <barries at slaysys dot com>"
LICENSE = "Artistic-1.0"

PV = "0.93"

RPM_NAME = "perl-Regexp-Shellish-0.93-164.31.aarch64.rpm"
RPM_HASH = "81d8e9c1fe178a01d1cb416b8492de72a5189106a336764f46745a6b981fa15fae117e5e14246eca04ee63d00a159820203673bc3593849c75dece898ce0bccc"

RPROVIDES:${PN} += "perl-Regexp--Shellish \
perl-Regexp-Shellish"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
