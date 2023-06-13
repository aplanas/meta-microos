SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "python310-flake8-deprecated-2.0.1-1.3.noarch.rpm"
RPM_HASH = "7e16f2a124360569d4490199305d8add9a8ac38aaed724f7c31ac564e9b535fb0c306e4bcbeea4eed3acfb78543d04c04fd083a634c7459d7a58807b8c54ace1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-deprecated \
python3.10dist(flake8-deprecated) \
python310-flake8-deprecated \
python3dist(flake8-deprecated)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8"

inherit rpm
