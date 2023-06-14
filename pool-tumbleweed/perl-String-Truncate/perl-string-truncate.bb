SUMMARY = "Module for when strings are too long to be displayed in.."
DESCRIPTION = "a module for when strings are too long to be displayed in..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.100603"

RPM_NAME = "perl-String-Truncate-1.100603-1.2.noarch.rpm"
RPM_HASH = "2399d1f210dfad7e1fa99f65d8498399116b280676cc08cf6d06b2c2db62a0d9e801000553de0be20ec0cc5bb86dcacb23877c7d7bd2734c824f61a6a887f66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Truncate \
perl-String-Truncate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub--Install"

inherit rpm
