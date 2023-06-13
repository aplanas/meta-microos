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

RPM_NAME = "python310-param-1.13.0-1.2.noarch.rpm"
RPM_HASH = "c750c74824bc652aea0cd05b007bdfd060f10a85de564c60a365b3431a9ddd83a728b9011a4a12c9c1d05c8892f227280a519b5729f236e20458bd4fc6b8dbb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-param \
python3.10dist(param) \
python310-param \
python3dist(param)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
