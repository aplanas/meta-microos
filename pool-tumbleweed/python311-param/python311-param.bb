SUMMARY = "Declarative Python programming using Parameters"
DESCRIPTION = "Param is a library providing Parameters: Python attributes extended to \
have features such as type and range checking, dynamically generated \
values, documentation strings, default values, etc., each of which is \
inherited from parent classes if not specified in a subclass. \
 \
Param contains only two required Python files, with no external \
dependencies, and is provided freely for both non-commercial and \
commercial use under a BSD license, so that it can easily be included \
as part of other projects."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python311-param-1.13.0-1.4.noarch.rpm"
RPM_HASH = "c6431d2a37b6d278561033913c866f9e0d3ee464702b9a041321d88fcad67d9bf48b44145d8ba585692e4bfef737d9284fd55c1fc5e354b819bf7a47597eb474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-param \
python3.11dist-param \
python311-param \
python3dist-param"

RDEPENDS:${PN} += "python-abi"

inherit rpm
