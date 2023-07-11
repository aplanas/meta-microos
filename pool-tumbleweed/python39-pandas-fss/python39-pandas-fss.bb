SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-fss-2.0.2-4.1.noarch.rpm"
RPM_HASH = "f34a584f8ec538cba26d1e22e1571fc76eb902e03fc563088007cefe5412c77bad69de19d1fdd864d42db9b0e421429b89b38700cd0ef47920a4af918e556c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-fss"

RDEPENDS:${PN} += "python39-fsspec \
python39-pandas"

inherit rpm
