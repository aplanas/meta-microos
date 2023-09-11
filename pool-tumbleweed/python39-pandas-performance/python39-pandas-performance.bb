SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-performance-2.0.3-1.3.noarch.rpm"
RPM_HASH = "7e1cef4b6d64918dfeed11bfc6bcdba5d77cb6d1042d1938f6d80db744ae3e249fcb8aa8d50f4e85ff3490a154e4bb28538e0885bf3832be69750d15300f9912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-performance"

RDEPENDS:${PN} += "python39-Bottleneck \
python39-numba \
python39-numexpr \
python39-pandas"

inherit rpm
