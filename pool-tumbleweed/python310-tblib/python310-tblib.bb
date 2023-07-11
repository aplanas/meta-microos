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

RPM_NAME = "python310-tblib-1.7.0-2.3.noarch.rpm"
RPM_HASH = "472222054851bfdc7ecf214ce266df305798be510f68ee13606e7b21dc4eb1f586ae3af7067cf3dde055efc759e60ad467a34b7c0e2b3e8931b557c6a81fb596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tblib \
python310-tblib \
python3dist-tblib"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
