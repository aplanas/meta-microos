SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-fss-2.0.2-4.1.noarch.rpm"
RPM_HASH = "c4e21c639dd2f762290432759957915dadbb79b8b092bbca28a28e8458b4547facbdd8d86a95b993f57669a86117eb15dc497f5a90b63b516c95f92916d8f37f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-fss \
python311-pandas-fss"

RDEPENDS:${PN} += "python311-fsspec \
python311-pandas"

inherit rpm
