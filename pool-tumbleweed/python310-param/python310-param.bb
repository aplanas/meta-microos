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

RPM_NAME = "python310-param-1.13.0-1.4.noarch.rpm"
RPM_HASH = "cdcfd396ee36e3d66e7f163dc943268ca6b048cd15cb658b6cfa4d6ac84ff9dcc661f4b109703bd40429f3432d868e71ca4958f7685870aef105a1aa243e0438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-param \
python310-param \
python3dist-param"

RDEPENDS:${PN} += "python-abi"

inherit rpm
