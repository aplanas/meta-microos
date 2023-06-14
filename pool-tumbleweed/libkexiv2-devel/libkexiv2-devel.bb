SUMMARY = "Build environment for libkexiv2, a library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkexiv2-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e32ddc3855960027f0bc6c121f7b1b783f5cb25335fbae1765058be3670fc44e8c7caa9c804b9974b36931026f92114a1c7fb9033e190fa3070230f3628c1d25"

RPROVIDES:${PN} += "cmake-KF5KExiv2 \
libkexiv2-devel \
libkexiv2-kf5-devel"

RDEPENDS:${PN} += "libKF5KExiv2-15-0-0"

inherit rpm
