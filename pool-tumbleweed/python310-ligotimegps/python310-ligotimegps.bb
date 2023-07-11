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

RPM_NAME = "python310-ligotimegps-2.0.1-3.4.noarch.rpm"
RPM_HASH = "343cafdb525ed8df71832e95f3776d568ca932079b90a4f09d7e856afa746eb5a318f488425fd5cd9667d7210d22a67d130d8fe4dc6b0b3712cc6e603eec9e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ligotimegps \
python310-ligotimegps \
python3dist-ligotimegps"

RDEPENDS:${PN} += "python-abi"

inherit rpm
