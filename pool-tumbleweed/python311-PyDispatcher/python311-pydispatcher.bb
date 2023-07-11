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

RPM_NAME = "python311-PyDispatcher-2.0.7-1.2.noarch.rpm"
RPM_HASH = "c8b66e36a50db8502b9f95daeadd19abea70dadaa4db58edb426f125d52fa949e3c453bb5b05629da1fffe8fd89f2ab4e4104ecfa4449c0121328b55fab91bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyDispatcher \
python3.11dist-pydispatcher \
python311-PyDispatcher \
python3dist-pydispatcher"

RDEPENDS:${PN} += "python-abi"

inherit rpm
