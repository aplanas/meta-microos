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

RPM_NAME = "python310-PyDispatcher-2.0.7-1.2.noarch.rpm"
RPM_HASH = "0469fd822ea9ac79d1a25575af45449f3cdf31f82839a256eb6875d35b469e1ea33cda7134bb1dc5699d750fe872b7b0a4810bd3053c8deabceca3df27e55732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydispatcher \
python310-PyDispatcher \
python3dist-pydispatcher"

RDEPENDS:${PN} += "python-abi"

inherit rpm
