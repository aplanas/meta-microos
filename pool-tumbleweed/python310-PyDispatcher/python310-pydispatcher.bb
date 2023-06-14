SUMMARY = "Multi-producer-multi-consumer signal dispatching mechanism"
DESCRIPTION = "Dispatcher mechanism for creating event models. \
 \
PyDispatcher is an enhanced version of Patrick K. O’Brien’s original \
dispatcher.py module. It provides the Python programmer with a robust \
mechanism for event routing within various application contexts. \
 \
Included in the package are the robustapply and saferef modules, which \
provide the ability to selectively apply arguments to callable objects and \
to reference instance methods using weak-references."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python310-PyDispatcher-2.0.7-1.1.noarch.rpm"
RPM_HASH = "c950de0b66a4f2031afc85265c9fc860263f83aca5b9b2512951a2a36ce0e9525448a60cdd8014630f6f42b483d3aadac8a5a30299d8d33b1988e0a5a1712e5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyDispatcher \
python3.10dist-pydispatcher \
python310-PyDispatcher \
python3dist-pydispatcher"

RDEPENDS:${PN} += "python-abi"

inherit rpm
