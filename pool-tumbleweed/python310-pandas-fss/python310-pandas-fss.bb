SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-fss-2.0.2-4.1.noarch.rpm"
RPM_HASH = "02adb6ed8afe77465b22d20ac34e7c635761ed05cf804f987f4c2b9d4de27c2cc068ed2d07821a7129525ee23bc15eb851bf2e435d9b7a373f0b7a845936cb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-fss"

RDEPENDS:${PN} += "python310-fsspec \
python310-pandas"

inherit rpm
