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

RPM_NAME = "python311-ligotimegps-2.0.1-3.4.noarch.rpm"
RPM_HASH = "7328ff865141e34d9452a1aaaaad1cddbc36ff43b3223dff54e269317cb3d8753aa8ca77ed4d355406707bb8bb28e9b9df375b73e0f28f66a0ceb41c95c18061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ligotimegps \
python3.11dist-ligotimegps \
python311-ligotimegps \
python3dist-ligotimegps"

RDEPENDS:${PN} += "python-abi"

inherit rpm
