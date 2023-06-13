SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "python310-environ-config-23.2.0-1.1.noarch.rpm"
RPM_HASH = "29cfc251f5f7f834f3df928a5f6e5972e49da9129deedbd9f64b1bcd06d74fc91a7b90461caf373f005f31b2a024702e2feeb7b79e3a5bf415e816c100320bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environ-config \
python3.10dist(environ-config) \
python310-environ-config \
python3dist(environ-config)"

RDEPENDS:${PN} += "python(abi) \
python310-attrs"

inherit rpm
