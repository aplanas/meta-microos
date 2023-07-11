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

RPM_NAME = "python39-PyDispatcher-2.0.7-1.2.noarch.rpm"
RPM_HASH = "ee1f65e4145f3aabf4571b913799221da6264d02b8775a2ce155752caad094ce49a42f30aa3a84c5ac4f431e51136802dade22d124415d4a62ecd1180e0b1908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydispatcher \
python39-PyDispatcher \
python3dist-pydispatcher"

RDEPENDS:${PN} += "python-abi"

inherit rpm
