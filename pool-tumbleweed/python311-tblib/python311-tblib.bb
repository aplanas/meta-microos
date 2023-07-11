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

RPM_NAME = "python311-tblib-1.7.0-2.3.noarch.rpm"
RPM_HASH = "ae53832a95e5922c74c6d6ebc0b900318032761782a28edeaeff50fca3736f68c234823189234cdb1770d253251c0498ed4eb8ea34084419cfda9b8eb410560b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tblib \
python3.11dist-tblib \
python311-tblib \
python3dist-tblib"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
