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

RPM_NAME = "python310-ligotimegps-2.0.1-3.2.noarch.rpm"
RPM_HASH = "d1f2c784d6e7e24c0fd013366b4b6b304765ee27c988bd231a4f39ed7298833665da28e108eb64b5ee90b72fa35ed32e3b139fb43e05024d31e630ea096a79bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ligotimegps \
python3.10dist(ligotimegps) \
python310-ligotimegps \
python3dist(ligotimegps)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
