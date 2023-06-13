SUMMARY = "A pure-python version of lalLIGOTimeGPS"
DESCRIPTION = "This module provides a pure-python version of the `LIGOTimeGPS` class, \
used to represent GPS times (number of seconds elapsed since GPS \
epoch) with nanoseconds precision. \
 \
This module is primarily for use as a drop-in replacement for the \
'official' `lal.LIGOTimeGPS` class (provided by the SWIG-python \
bindings of [LAL](//wiki.ligo.org/DASWG/LALSuite)) for use on those \
environments where LAL is not available, or building LAL is \
unnecessary for the application (e.g. testing). \
 \
The code provided here is much slower than the C-implementation \
provided by LAL, so if you really care about performance, don't use \
this module."
LICENSE = "GPL-3.0-only"

PV = "2.0.1"

RPM_NAME = "python39-ligotimegps-2.0.1-3.2.noarch.rpm"
RPM_HASH = "7beab521e798579f00f86283b9d6f25cb0b9e8d81c5ba59f6b6324a6e02f639ad1261f480bc836d705c01a47b6a6fe57746dc75b03279f50158d5215fb22ab07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ligotimegps) \
python39-ligotimegps \
python3dist(ligotimegps)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
