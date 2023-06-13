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

RPM_NAME = "python310-exceptiongroup-1.1.1-2.1.noarch.rpm"
RPM_HASH = "a7e7c0d4140b2c01ff7f8f7e839dd617ecff8f643499a28885c0fef1daee16fed032c149bea3107312d33e22480f09f481223ed850926b7a68b056d8691d6a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exceptiongroup \
python3.10dist(exceptiongroup) \
python310-exceptiongroup \
python3dist(exceptiongroup)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
