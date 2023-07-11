SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python39-vcversioner-2.16.0.0-4.10.noarch.rpm"
RPM_HASH = "9f26f64d02e79d7d53a03481c12c40d778293d686536ce292739668060ecd1b5f0b9264baf2fdb54a0bc342a705355791045b8d76631f54dccb35cb7cb1f8ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vcversioner \
python39-vcversioner \
python3dist-vcversioner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
