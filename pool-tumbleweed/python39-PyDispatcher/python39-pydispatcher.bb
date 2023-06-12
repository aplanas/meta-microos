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

RPM_NAME = "python39-PyDispatcher-2.0.7-1.1.noarch.rpm"
RPM_HASH = "430d702d7f233da9f555d0c5a8c35376cda72ba8c4306cf8f652543d4a4c28a3173859432ac1dc329775c744de8713eaebe385319c6c2f38ac89e7af6308b288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydispatcher) \
python39-PyDispatcher \
python3dist(pydispatcher)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
