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

RPM_NAME = "python310-locket-1.0.0-1.6.noarch.rpm"
RPM_HASH = "b008e91e40a6576153caec74a697b3ed3e411bc4f40b34588caf474372d0ac6f32130b379fad203d157ca9f749c1cf449892b49c1b8370ff287a935d6766f6e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-locket \
python310-locket \
python3dist-locket"

RDEPENDS:${PN} += "python-abi"

inherit rpm
