SUMMARY = "Glob module recursive wildcards support"
DESCRIPTION = "This module provides an extended version of Python's builtin glob \
module with the following additions: \
 \
- The ability to capture the text matched by glob patterns, and \
  return those matches alongside the filenames. \
- A recursive '**' globbing syntax, akin for example to the globstar \
  option of the bash shell. \
- The ability to replace the filesystem functions used, in order to \
  glob on virtual filesystems."
LICENSE = "BSD-2-Clause"

PV = "0.7"

RPM_NAME = "python311-glob2-0.7-2.13.noarch.rpm"
RPM_HASH = "9e0ccb3f75e5589825018e1bee8ec1996534fd8ef261cac09de25cf0f5cb271b71df76e65aaed2f4b9e42559dd4ebe94687f161ab97f98884d150c3cebd73ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-glob2 \
python311-glob2 \
python3dist-glob2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
