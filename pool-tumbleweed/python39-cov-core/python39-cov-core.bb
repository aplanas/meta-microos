SUMMARY = "Plugin core for use by pytest-cov, nose-cov and nose2-cov"
DESCRIPTION = "This is a lib package for use by pytest-cov, nose-cov and nose2-cov.  Unless your developing a \
coverage plugin for a test framework then you probably want one of those."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python39-cov-core-1.15.0-4.14.noarch.rpm"
RPM_HASH = "cc26ec5963730acb24448773e9ede7e849c1db45f5ead319ea32319fac1ef5d7680aca2754e13124fc7c27834e3dac2dda30d0168a4a1b8cb1e53f9afdf97c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cov-core) \
python39-cov-core \
python3dist(cov-core)"

RDEPENDS:${PN} += "python(abi) \
python39-coverage"

inherit rpm
