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

RPM_NAME = "python39-verboselogs-1.7-7.1.noarch.rpm"
RPM_HASH = "2cc70544b99c4b19265be9f738e349ba2ec45e087451633e324edd5d79ec3dc94afdbc014647a789066d456f4a3fed9cb1d5a500d9ed5d801e9e5f5ce2cb4044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-verboselogs \
python39-verboselogs \
python3dist-verboselogs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
