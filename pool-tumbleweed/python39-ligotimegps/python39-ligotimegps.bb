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

RPM_NAME = "python39-ligotimegps-2.0.1-3.4.noarch.rpm"
RPM_HASH = "6eca2e8f3bcca8f67c58e17311a9cae66112f59b75139a53551498d0711987e451f3623e811732a76391556e733201295e06fdab62442a87cad254c447898288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ligotimegps \
python39-ligotimegps \
python3dist-ligotimegps"

RDEPENDS:${PN} += "python-abi"

inherit rpm
