SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "0.15.2"

RPM_NAME = "python310-pytest-djangoapp-0.15.2-2.9.noarch.rpm"
RPM_HASH = "b471f2b52b4d76a44485ba41c022174d868772b4ef6b8b0e61bb407fa1c55fe7eb3690cac9484dc68c90cf34798d62b8fbb409bfb21c4fde7fdba740e204b957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-djangoapp \
python310-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pytest"

inherit rpm
