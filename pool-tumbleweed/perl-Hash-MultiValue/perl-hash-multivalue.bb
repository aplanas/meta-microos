SUMMARY = "Store multiple values per key"
DESCRIPTION = "Hash::MultiValue is an object (and a plain hash reference) that may contain \
multiple values per key, inspired by MultiDict of WebOb."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Hash-MultiValue-0.16-1.27.noarch.rpm"
RPM_HASH = "37bce8538a21a6c1fc3bdff578b0a1ce23d1b99be15d715803bafcb5b2287a5e2ab0f941550f3826abb413d86c3b429c945fb1d51ea8b5f516798c3a37d2ea5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--MultiValue \
perl-Hash-MultiValue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
