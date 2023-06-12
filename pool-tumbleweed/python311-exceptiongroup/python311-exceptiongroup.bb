SUMMARY = "Backport of PEP 654 (exception groups)"
DESCRIPTION = "This is a backport of the ``BaseExceptionGroup`` and ``ExceptionGroup`` classes from \
Python 3.11. \
 \
It contains the following: \
 \
* The  ``exceptiongroup.BaseExceptionGroup`` and ``exceptiongroup.ExceptionGroup`` \
  classes \
* A utility function (``exceptiongroup.catch()``) for catching exceptions possibly \
  nested in an exception group \
* Patches to the ``TracebackException`` class that properly formats exception groups \
  (installed on import) \
* An exception hook that handles formatting of exception groups through \
  ``TracebackException`` (installed on import) \
* Special versions of some of the functions from the ``traceback`` module, modified to \
  correctly handle exception groups even when monkey patching is disabled, or blocked by \
  another custom exception hook: \
 \
  * ``traceback.format_exception()`` \
  * ``traceback.format_exception_only()`` \
  * ``traceback.print_exception()`` \
  * ``traceback.print_exc()`` \
 \
If this package is imported on Python 3.11 or later, the built-in implementations of the \
exception group classes are used instead, ``TracebackException`` is not monkey patched \
and the exception hook won't be installed."
LICENSE = "MIT & Python-2.0"

PV = "1.1.1"

RPM_NAME = "python311-exceptiongroup-1.1.1-2.1.noarch.rpm"
RPM_HASH = "16144a54e9f0294e26e651ed3e0f8e16ba2980e6a64f98a7ddd9d516c64f83d92aadf1e2074f2177d125d78580ba3bd07aaf943fe61bb827fb8a805cdd759a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(exceptiongroup) \
python311-exceptiongroup \
python3dist(exceptiongroup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
