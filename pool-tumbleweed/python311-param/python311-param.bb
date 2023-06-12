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

RPM_NAME = "python311-param-1.13.0-1.2.noarch.rpm"
RPM_HASH = "3c7ae57851008cf161acc1b86db2c0c1c0dcf941b3bcf5f57653d4e1d3f31f3ddbdb12be79750a712f83a8d94b98e499a85ecbef26aeae24ac49cad7aa3062c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(param) \
python311-param \
python3dist(param)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
