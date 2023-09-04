SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-plot-2.0.3-1.2.noarch.rpm"
RPM_HASH = "572e589031731df96b98d9a86551a2be04a3f902835fe2750b095c8fc57bb22d93030df25a706dff02cec261997214c97a47f4eb0623526aa1975f284efbb565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-plot"

RDEPENDS:${PN} += "python310-matplotlib \
python310-pandas"

inherit rpm
