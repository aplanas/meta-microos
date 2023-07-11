SUMMARY = "Traceback serialization library"
DESCRIPTION = "Traceback serialization library. \
 \
It allows you to: \
 \
* Pickle  tracebacks and raise exceptions with pickled tracebacks in \
  different processes. This allows better error handling when running \
  code over multiple processes (imagine multiprocessing, billiard, \
  futures, celery etc). \
* Create traceback objects from strings (the ``from_string`` method). \
  *No pickling is used*. \
* Serialize tracebacks to/from plain dicts (the ``from_dict`` and \
  ``to_dict`` methods). *No pickling is used*. \
* Raise the tracebacks created from the aforementioned sources. \
 \
Again, note that using the pickle support is completely optional. You \
are solely responsible for security problems should you decide to use \
the pickle support."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python39-tblib-1.7.0-2.3.noarch.rpm"
RPM_HASH = "564638d901790375407c3ed0bd7ea5f9ca06c649bc6e4e3a3ca31eb4fcd6f908494b19a1f5007527d872f9e056d7f9ab8be41f007ebb5646fb34119e12a1165d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tblib \
python39-tblib \
python3dist-tblib"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
