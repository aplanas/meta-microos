SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python39-django-tagulous-1.3.3-1.7.noarch.rpm"
RPM_HASH = "f377ae6f4320d403fcd8bc79098e94c7eb64164c8ab79725341c815828c91275de4b0219b2856e39fddcaa485532c570a5bb57799d54af65dd590c48604a4006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-tagulous \
python39-django-tagulous \
python3dist-django-tagulous"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
