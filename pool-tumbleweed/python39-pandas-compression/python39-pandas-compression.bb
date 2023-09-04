SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-compression-2.0.3-1.2.noarch.rpm"
RPM_HASH = "333dbe051bacf99b80a9215489a51313d7cb9e18f8d969530ae664d5e9da62f6d0db7622d730f154ea8c7903f4d9baec2a7bab79cb86fc944cd0dd243843da6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-compression"

RDEPENDS:${PN} += "python39-brotlipy \
python39-pandas \
python39-python-snappy \
python39-zstandard"

inherit rpm
