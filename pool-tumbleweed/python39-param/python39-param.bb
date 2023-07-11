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

RPM_NAME = "python39-param-1.13.0-1.4.noarch.rpm"
RPM_HASH = "821e51b697ca86cf23b1e71ac04464a8b6fb9e506432ee1289c3eb5afae11b1c809629ad438635c3fbddaca037b4ad9075e300678d16c67f5274f4819638534e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-param \
python39-param \
python3dist-param"

RDEPENDS:${PN} += "python-abi"

inherit rpm
