SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-fss-2.0.3-1.2.noarch.rpm"
RPM_HASH = "5cbe818d5e40a1b3b067c2fbe3fbd207855fb891503f52d51951b47399d46bff9e5c1f3283f6ec553f52144575aa0ee40007cef71a754b238f7bb1d5ebfe8a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-fss"

RDEPENDS:${PN} += "python310-fsspec \
python310-pandas"

inherit rpm
