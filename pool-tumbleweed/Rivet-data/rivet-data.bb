SUMMARY = "Data files for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
 \
This package provides common data files for Rivet used by both C++ \
and Python bindings."
LICENSE = "GPL-2.0-only"

PV = "3.1.7"

RPM_NAME = "Rivet-data-3.1.7-1.2.noarch.rpm"
RPM_HASH = "a0cd27aadc312295d6f6aa773c87110afa5e4f45d94a634d5bc22ce12efbd40ed3f3e46d58f7cc201e9fb63fb594ac297b48a6d1a39f5a8c1cbdc1cb18be3555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Rivet-data"

RDEPENDS:${PN} += ""

inherit rpm
