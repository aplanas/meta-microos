SUMMARY = "File-based locks for Python"
DESCRIPTION = "Locket implements a lock that can be used by multiple processes provided \
they use the same path. \
 \
Locks largely behave as (non-reentrant) `Lock` instances from the `threading` \
module in the standard library. Specifically, their behaviour is: \
 \
* Locks are uniquely identified by the file being locked, \
  both in the same process and across different processes. \
* Locks are either in a locked or unlocked state. \
* When the lock is unlocked, calling `acquire()` returns immediately and changes \
  the lock state to locked. \
* When the lock is locked, calling `acquire()` will block until the lock state \
  changes to unlocked, or until the timeout expires. \
* If a process holds a lock, any thread in that process can call `release()` to \
  change the state to unlocked. \
* Behaviour of locks after `fork` is undefined."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python311-locket-1.0.0-1.6.noarch.rpm"
RPM_HASH = "ae0adaa450ed9e305044c2936b7b137676cce737ac374f19ae6bd337b6fa1c557ac367b76326112f4b55266d4e7af47ad16a11bb2f648190faad767f3f46cc4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-locket \
python3.11dist-locket \
python311-locket \
python3dist-locket"

RDEPENDS:${PN} += "python-abi"

inherit rpm
