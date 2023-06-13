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

RPM_NAME = "python310-tblib-1.7.0-1.11.noarch.rpm"
RPM_HASH = "55e681fec42feb025ac3857a168bdf654ab44ed448cfd812648d3b4132d715e6583f702c09c8c48155cf0f52aa99cdc201d9aa3b3d8bc9365d7d9e7b9b0ff64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tblib \
python3.10dist(tblib) \
python310-tblib \
python3dist(tblib)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
