SUMMARY = "Parse and format W3CDTF datetime strings"
DESCRIPTION = "This module understands the W3CDTF date/time format, an ISO 8601 profile, \
defined at http://www.w3.org/TR/NOTE-datetime. This format as the native \
date format of RSS 1.0. \
 \
It can be used to parse these formats in order to create the appropriate \
objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-DateTime-Format-W3CDTF-0.08-1.12.noarch.rpm"
RPM_HASH = "cb9f78107c1258679d949d4a7907277585283061e029f7f779c294de1f8c184f20aa21a47d2d4c206c2ef3192eda77ed04d91d0a45a10d1e12a24e41a5143308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--W3CDTF \
perl-DateTime-Format-W3CDTF"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime"

inherit rpm
