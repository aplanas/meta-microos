SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python310-django-tagulous-1.3.3-1.7.noarch.rpm"
RPM_HASH = "cdf165a90505c6ba37febe46fc16a3cd4bda9079c3718c80847da78a5f5df4418f2409747f583389c48a4fadeec734f94d3bea56f6b34fa2aecfdf84e69686ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-tagulous \
python310-django-tagulous \
python3dist-django-tagulous"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
