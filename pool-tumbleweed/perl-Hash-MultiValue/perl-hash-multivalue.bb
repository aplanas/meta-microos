SUMMARY = "Store multiple values per key"
DESCRIPTION = "Hash::MultiValue is an object (and a plain hash reference) that may contain \
multiple values per key, inspired by MultiDict of WebOb."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Hash-MultiValue-0.16-1.28.noarch.rpm"
RPM_HASH = "557547915cd1392b4b0ca5a1d02bac9b44393890871978b0a8879bb931b0e29af15fd50c50d0dfe8b743aae4b18a26c671edf6bcd440f3d599843e456a19e0f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--MultiValue \
perl-Hash-MultiValue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
