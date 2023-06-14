SUMMARY = "Store multiple values per key"
DESCRIPTION = "Hash::MultiValue is an object (and a plain hash reference) that may contain \
multiple values per key, inspired by MultiDict of WebOb."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Hash-MultiValue-0.16-1.26.noarch.rpm"
RPM_HASH = "4ea0da363fa9af8a8e0a89507c871d69030a64e6fd0ab8fa4a4ca33347d576d17cf78ba4c2514283d742548b19c9506099380103859c25a5616310c9ba6cbba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--MultiValue \
perl-Hash-MultiValue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
