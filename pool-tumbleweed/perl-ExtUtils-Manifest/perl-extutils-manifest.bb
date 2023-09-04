SUMMARY = "Utilities to write and check a MANIFEST file"
DESCRIPTION = "..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-ExtUtils-Manifest-1.75-1.3.noarch.rpm"
RPM_HASH = "cfd2737f6759994a62e87f4baa38e051ab804a26f8dda0655cbbc1064e3a329c10cfe41f432b848af61e7c4613bcb849d4f7d8262874bd5745c9250875d64803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Manifest \
perl-ExtUtils-Manifest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
