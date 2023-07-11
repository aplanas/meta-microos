SUMMARY = "Verbose logging level for Python's logging module"
DESCRIPTION = "The verboselogs_ package extends Python's logging_ module to add the log levels \
VERBOSE_, NOTICE_, and SPAM_: \
 \
- The VERBOSE level sits between the predefined INFO and DEBUG levels. \
- The NOTICE level sits between the predefined WARNING and INFO levels. \
- The SPAM level sits between the predefined DEBUG and NOTSET levels. \
 \
It is currently tested on Python 2.6, 2.7, 3.4, 3.5 and PyPy."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python311-verboselogs-1.7-7.1.noarch.rpm"
RPM_HASH = "48dded5710ead51edbc30b1be6843c098cb27513c0f303dece5c79be120d19def65226b65fc11b877ed28d96c6ea81393008479829f5bd2927e4224bdb936282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-verboselogs \
python3.11dist-verboselogs \
python311-verboselogs \
python3dist-verboselogs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
