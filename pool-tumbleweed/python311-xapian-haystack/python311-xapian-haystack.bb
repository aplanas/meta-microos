SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "2.1.1"

RPM_NAME = "python311-xapian-haystack-2.1.1-1.11.noarch.rpm"
RPM_HASH = "f25e6130ebd58b7889d15207c2d14b1fa0e42291fa7ad30f23fae7ee4b4fe1780faedc76bb76845f355468a5c0df79b69759c4dfd5161dac4cd434f5af969f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xapian-haystack) \
python311-xapian-haystack \
python3dist(xapian-haystack)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-django-haystack"

inherit rpm
