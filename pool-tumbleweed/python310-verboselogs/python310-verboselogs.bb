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

RPM_NAME = "python310-verboselogs-1.7-7.1.noarch.rpm"
RPM_HASH = "65fd68bec9b35d6c55bbf2cc2a0d4121978522eccec7259db81538436957184ec192c80a52b97476b5885b048c9bf83672e21aee067af15e1952e767ab0fda40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-verboselogs \
python310-verboselogs \
python3dist-verboselogs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
